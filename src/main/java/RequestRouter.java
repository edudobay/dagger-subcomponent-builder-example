import dagger.*;
import javax.inject.*;

@Singleton
class RequestRouter {
  private final Provider<RequestComponent.Builder> requestComponentProvider;

  @Inject RequestRouter(
      Provider<RequestComponent.Builder> requestComponentProvider) {
    this.requestComponentProvider = requestComponentProvider;
  }
  void dataReceived(Data data) {
    RequestComponent requestComponent =
        requestComponentProvider.get()
            .data(data)
            .build();
    requestComponent.requestHandler()
        .writeResponse(200, "hello, world");
  }
}
