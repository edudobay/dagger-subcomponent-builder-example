import dagger.*;
import javax.inject.*;

@Subcomponent(modules = RequestModule.class)
interface RequestComponent {
  RequestHandler requestHandler();

  @Subcomponent.Builder
  interface Builder {
    Builder data(Data data);
    RequestComponent build();
  }
}


