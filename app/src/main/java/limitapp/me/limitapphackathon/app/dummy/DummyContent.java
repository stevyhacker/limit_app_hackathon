package limitapp.me.limitapphackathon.app.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
    public static final List<DummyItem> YEARS = new ArrayList<DummyItem>();
    public static final List<DummyItem> MONTHS = new ArrayList<DummyItem>();

    private static final int COUNT = 15;

    static {
        // Add some sample items.
        ITEMS.add(new DummyItem("1000", "Total", "650"));
        ITEMS.add(new DummyItem("300", "Food", "150"));
        ITEMS.add(new DummyItem("250", "Rent", "0"));
        ITEMS.add(new DummyItem("200", "Clothing", "160"));
        ITEMS.add(new DummyItem("100", "Transportation", "40"));
        ITEMS.add(new DummyItem("80", "Education", "40"));
        ITEMS.add(new DummyItem("150", "Entertainment", "50"));

        for (int i = ITEMS.size(); i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }

        YEARS.add(new DummyItem("2010", "Total", "650"));
        YEARS.add(new DummyItem("2011", "Food", "150"));
        YEARS.add(new DummyItem("2012", "Rent", "0"));
        YEARS.add(new DummyItem("2013", "Clothing", "160"));
        YEARS.add(new DummyItem("2014", "Transportation", "40"));
        YEARS.add(new DummyItem("2015", "Education", "40"));
        YEARS.add(new DummyItem("2016", "Entertainment", "50"));
        YEARS.add(new DummyItem("2017", "Entertainment", "50"));
        YEARS.add(new DummyItem("2018", "Entertainment", "50"));


        MONTHS.add(new DummyItem("Jan", "Total", "650"));
        MONTHS.add(new DummyItem("Feb", "Food", "150"));
        MONTHS.add(new DummyItem("Mar", "Rent", "0"));
        MONTHS.add(new DummyItem("Apr", "Clothing", "160"));
        MONTHS.add(new DummyItem("May", "Transportation", "40"));
        MONTHS.add(new DummyItem("Jun", "Education", "40"));
        MONTHS.add(new DummyItem("Jul", "Entertainment", "50"));
        MONTHS.add(new DummyItem("Aug", "Entertainment", "50"));
        MONTHS.add(new DummyItem("Sep", "Entertainment", "50"));
        MONTHS.add(new DummyItem("Oct", "Entertainment", "50"));
        MONTHS.add(new DummyItem("Nov", "Entertainment", "50"));
        MONTHS.add(new DummyItem("Dec", "Entertainment", "50"));


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem("200", "Item " + position, "100");
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
