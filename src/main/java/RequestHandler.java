import dagger.*;
import java.util.Locale;
import javax.inject.*;

class RequestHandler {
  private final Data data;

  @Inject RequestHandler(Data data) {
    this.data = data;
  }

  void writeResponse(int responseCode, String body) {
    System.out.printf(Locale.US, "<-- %s\n", data.getContents());
    System.out.printf(Locale.US, "--> [%d] %s\n", responseCode, body);
  }
}
