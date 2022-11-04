package day55_polymorphism.shopping;

public interface ConsumerApp extends Shipping, AllowUserToSell {
}

abstract class TestA implements Shipping, AllowUserToSell {}

abstract class TestB implements ConsumerApp{}