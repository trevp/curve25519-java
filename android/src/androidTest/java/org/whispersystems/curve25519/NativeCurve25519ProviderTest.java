package org.whispersystems.curve25519;

public class NativeCurve25519ProviderTest extends Curve25519ProviderTest implements Curve25519ProviderInternalTest {
  @Override
  protected Curve25519Provider createProvider() throws NoSuchProviderException {
    return new NativeCurve25519Provider();
  }

  public native boolean internalTest();

  public void testInternalTest() throws Exception {
    assertTrue(internalTest());
  }


}
