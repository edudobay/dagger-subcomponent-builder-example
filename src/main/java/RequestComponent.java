import dagger.*;
import dagger.BindsInstance;
import javax.inject.*;

@Subcomponent(modules = RequestModule.class)
interface RequestComponent {
  RequestHandler requestHandler();

  Data data();

  @Subcomponent.Builder
  interface Builder {
    @BindsInstance Builder data(Data data);
    RequestComponent build();
  }
}


