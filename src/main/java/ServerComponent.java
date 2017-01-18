import dagger.*;
import javax.inject.*;

@Singleton
@Component(modules = ServerModule.class)
interface ServerComponent {
  RequestRouter requestRouter();
}

