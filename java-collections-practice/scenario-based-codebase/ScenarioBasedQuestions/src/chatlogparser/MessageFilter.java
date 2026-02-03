package chatlogparser;

public interface MessageFilter<T> {
    boolean allow(T message);
}