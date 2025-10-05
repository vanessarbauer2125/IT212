package gpaconverter;

public class GPAConverter {

    public String convertGpaToPercent(double gpa) {
        // Round to one decimal
        gpa = Math.round(gpa * 10.0) / 10.0;

        String gpaKey = String.format("%.1f", gpa);
        String percentRange;

        switch (gpaKey) {
            case "4.0": percentRange = "100% to 95.0%"; break;
            case "3.9": percentRange = "< 95.0% to 94.0%"; break;
            case "3.8": percentRange = "< 94.0% to 93.0%"; break;
            case "3.7": percentRange = "< 93.0% to 92.0%"; break;
            case "3.6": percentRange = "< 92.0% to 91.0%"; break;
            case "3.5": percentRange = "< 91.0% to 90.0%"; break;
            case "3.4": percentRange = "< 90.0% to 89.0%"; break;
            case "3.3": percentRange = "< 89.0% to 88.0%"; break;
            case "3.2": percentRange = "< 88.0% to 87.0%"; break;
            case "3.1": percentRange = "< 87.0% to 86.0%"; break;
            case "3.0": percentRange = "< 86.0% to 85.0%"; break;
            case "2.9": percentRange = "< 85.0% to 84.0%"; break;
            case "2.8": percentRange = "< 84.0% to 83.0%"; break;
            case "2.7": percentRange = "< 83.0% to 82.0%"; break;
            case "2.6": percentRange = "< 82.0% to 81.0%"; break;
            case "2.5": percentRange = "< 81.0% to 80.0%"; break;
            case "2.4": percentRange = "< 80.0% to 79.0%"; break;
            case "2.3": percentRange = "< 79.0% to 78.0%"; break;
            case "2.2": percentRange = "< 78.0% to 77.0%"; break;
            case "2.1": percentRange = "< 77.0% to 76.0%"; break;
            case "2.0": percentRange = "< 76.0% to 75.0%"; break;
            case "1.9": percentRange = "< 75.0% to 74.0%"; break;
            case "1.8": percentRange = "< 74.0% to 73.0%"; break;
            case "1.7": percentRange = "< 73.0% to 72.0%"; break;
            case "1.6": percentRange = "< 72.0% to 71.0%"; break;
            case "1.5": percentRange = "< 71.0% to 70.0%"; break;
            case "1.4": percentRange = "< 70.0% to 69.0%"; break;
            case "1.3": percentRange = "< 69.0% to 68.0%"; break;
            case "1.2": percentRange = "< 68.0% to 67.0%"; break;
            case "1.1": percentRange = "< 67.0% to 66.0%"; break;
            case "1.0": percentRange = "< 66.0% to 65.0%"; break;
            case "0.0": percentRange = "< 65.0% to 0.0%"; break;
            default: percentRange = "Invalid GPA entered.";
        }

        return percentRange;
    }
}
