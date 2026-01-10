package browserbuddy;

import java.util.Stack;

public class TabManager {

    private Stack<BrowserTab> closedTabs = new Stack<>();

    public void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    public BrowserTab reopenTab() {
        if (!closedTabs.isEmpty()) {
            System.out.println("Reopened last closed tab");
            return closedTabs.pop();
        }
        System.out.println("No tabs to reopen");
        return null;
    }
}
