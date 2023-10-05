package lambdas.custom_foreach;

@FunctionalInterface
public interface ElementProcess<T> {
  void process(T element);
}
