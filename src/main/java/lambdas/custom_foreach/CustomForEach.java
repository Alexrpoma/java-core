package lambdas.custom_foreach;

import java.util.Collection;
import java.util.Objects;

public class CustomForEach<T> {
  public void forEach(Collection<T> collection, ElementProcess<? super T> elementProcess) {
    Objects.requireNonNull(elementProcess);
    for (T t: collection) {
      elementProcess.process(t);
    }
  }
}
