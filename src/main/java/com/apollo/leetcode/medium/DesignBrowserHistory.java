package com.apollo.leetcode.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1472. Design Browser History
 * <p>
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
 * Implement the BrowserHistory class:
 * <p>
 * - BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 * <p>
 * - void visit(string url) Visits url from the current page. It clears up all the forward history.
 * <p>
 * - string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
 * <p>
 * - string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 *
 * @see <a href="https://leetcode.com/problems/design-browser-history/">Design Browser History<a/>
 */
public class DesignBrowserHistory {

    public List<String> useBrowserHistory(List<String> commands, List<String> args) {
        List<String> result = new ArrayList<>();
        BrowserHistory browserHistory = null;

        Iterator<String> commandsIterator = commands.iterator();
        Iterator<String> argsIterator = args.iterator();

        while (commandsIterator.hasNext() && argsIterator.hasNext()) {
            String command = commandsIterator.next();
            String arg = argsIterator.next();

            switch (command) {
                case BrowserCommands.BROWSER_HISTORY:
                    browserHistory = new BrowserHistory(arg);
                    result.add(null);
                    break;
                case BrowserCommands.VISIT:
                    if (browserHistory == null) throw getIllegalException();
                    browserHistory.visit(arg);
                    result.add(null);
                    break;
                case BrowserCommands.BACK:
                    if (browserHistory == null) throw getIllegalException();
                    result.add(browserHistory.back(Integer.parseInt(arg)));
                    break;
                case BrowserCommands.FORWARD:
                    if (browserHistory == null) throw getIllegalException();
                    result.add(browserHistory.forward(Integer.parseInt(arg)));
                    break;
            }
        }

        return result;
    }

    private IllegalStateException getIllegalException() {
        return new IllegalStateException("BrowserHistory isn't initialized");
    }

    private static class BrowserHistory {

        public BrowserHistory(String homepage) {

        }

        public void visit(String url) {

        }

        public String back(int steps) {
            return null;
        }

        public String forward(int steps) {
            return null;
        }
    }

    public static class BrowserCommands {

        public static final String BROWSER_HISTORY = "BrowserHistory";

        public static final String VISIT = "visit";

        public static final String BACK = "back";

        public static final String FORWARD = "forward";
    }
}
