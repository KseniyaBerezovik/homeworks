package homework11.reporters;

import homework11.Entry;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Reporter {
    void createReport(File destination, List<Entry> logContent) throws IOException;
}
