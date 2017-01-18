import dagger.*;
import javax.inject.*;

@Singleton
class RequestRouter {
  @Inject RequestRouter(
      Provider<RequestComponent.Builder> requestComponentProvider) {}

  void dataReceived(Data data) {
    RequestComponent requestComponent =
        requestComponentProvider.get()
            .data(data)
            .build();
    requestComponent.requestHandler()
        .writeResponse(200, "hello, world");
  }
}
