package homework11.reporters;

public class ReporterFactory {

    public static Reporter createReporter(ReportType type) {
        switch (type) {
            case SIMPLE_REPORT:
                return new SimpleReportCreator();
            case DIFFICULT_REPORT:
                return new DifficultReportCreator();
        }
        return null;
    }
}
