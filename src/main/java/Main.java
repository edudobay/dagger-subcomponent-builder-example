public class Main {
  public static void main(String[] args) {
    ServerComponent serverComponent = DaggerServerComponent.builder()
      .serverModule(new ServerModule())
      .build();

    RequestRouter requestRouter = serverComponent.requestRouter();

    requestRouter.dataReceived(new Data(String.join("\n", args)));
  }
}
