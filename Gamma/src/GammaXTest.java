import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.apache.commons.math3.special.Gamma;

public class GammaXTest {
  GammaX g = null;

  @Before
  public void before() {
    g = new GammaX();
  }

  @Test
  public void testLogGamma() {
    double logGa1 = GammaX.logGamma(1);
    Assert.assertEquals(logGa1, Gamma.logGamma(1), 0.00000001);
    double logGa2 = GammaX.logGamma(1.53);
    Assert.assertEquals(logGa2, Gamma.logGamma(1.53), 0.00000001);
    double logGa3 = GammaX.logGamma(10.75);
    Assert.assertEquals(logGa3, Gamma.logGamma(10.75), 0.00000001);
    double logGa4 = GammaX.logGamma(100.65);
    Assert.assertEquals(logGa4, Gamma.logGamma(100.65), 0.00000001);
    double logGa5 = GammaX.logGamma(1.82E80);
    Assert.assertEquals(logGa5, Gamma.logGamma(1.82E80), 1E72);

  }

  @Test
  public void testGamma() {
    double g1 = GammaX.gamma(6);
    Assert.assertEquals(g1, Gamma.gamma(6), 0.0000001);
    double g2 = GammaX.gamma(4.000001);
    Assert.assertEquals(g2, Gamma.gamma(4.000001), 0.0000001);
    double g3 = GammaX.gamma(32);
    Assert.assertEquals(g3, Gamma.gamma(32), 1E25);
    double g4 = GammaX.gamma(-3.2);
    Assert.assertEquals(g4, Gamma.gamma(-3.2), 0.0000001);
    double g5 = GammaX.gamma(-0.00001);
    Assert.assertEquals(g5, Gamma.gamma(-0.00001), 0.0000001);
    double g6 = GammaX.gamma(-42.232);
    Assert.assertEquals(g6, Gamma.gamma(-42.232), 0.0000001);
    double g7 = GammaX.gamma(-242.232);
    Assert.assertEquals(g7, Gamma.gamma(-242.232), 0.0000001);
    double g8 = GammaX.gamma(100.87);
    Assert.assertEquals(g8, Gamma.gamma(100.87), 1E148);
    double g9 = GammaX.gamma(-20.87);
    Assert.assertEquals(g9, Gamma.gamma(-20.87), 0.0000001);
  }

  @Test
  public void testLn() {
    double ln1 = GammaX.ln(1);
    Assert.assertEquals(ln1, Math.log(1), 0.0000000000001);
    double ln2 = GammaX.ln(2.5);
    Assert.assertEquals(ln2, Math.log(2.5), 0.0000000000001);
    double ln3 = GammaX.ln(100.4);
    Assert.assertEquals(ln3, Math.log(100.4), 0.0000000000001);
    double ln4 = GammaX.ln(200);
    Assert.assertEquals(ln4, Math.log(200), 0.0000000000001);
    double ln5 = GammaX.ln(42812389.231312);
    Assert.assertEquals(ln5, Math.log(42812389.231312), 0.0000000001);

  }

  @Test
  public void testExp() {
    double exp1 = GammaX.exp(4);
    Assert.assertEquals(exp1, Math.exp(4), 0.0000000000001);
    double exp2 = GammaX.exp(3.22655);
    Assert.assertEquals(exp2, Math.exp(3.22655), 0.0000000000001);
    double exp3 = GammaX.exp(100.32);
    Assert.assertEquals(exp3, Math.exp(100.32), 1E30);
    double exp4 = GammaX.exp(1.554E82);
    Assert.assertEquals(exp4, Math.exp(1.554E82), 1E35);
    double exp5 = GammaX.exp(-3);
    Assert.assertEquals(exp5, Math.exp(-3), 0.0000000000001);
    double exp6 = GammaX.exp(-10.54);
    Assert.assertEquals(exp6, Math.exp(-10.54), 0.0000000000001);
    double exp7 = GammaX.exp(-1.42E44);
    Assert.assertEquals(exp7, Math.exp(-1.42E44), 0.0000000000001);
    double exp8 = GammaX.exp(-1.762E-214);
    Assert.assertEquals(exp8, Math.exp(-1.762E-214), 0.0000000000001);
  }

  @Test
  public void testSine() {
    double sin1 = GammaX.sine(-6000);
    Assert.assertEquals(sin1, Math.sin(-6000), 0.00000001);
    double sin2 = GammaX.sine(-8900.054);
    Assert.assertEquals(sin2, Math.sin(-8900.054), 0.00000001);
    double sin3 = GammaX.sine(-10000.00001);
    Assert.assertEquals(sin3, Math.sin(-10000.00001), 0.00000001);
    double sin4 = GammaX.sine(-1E6);
    Assert.assertEquals(sin4, Math.sin(-1E6), 0.0001);
    double sin5 = GammaX.sine(-1E8);
    Assert.assertEquals(sin5, Math.sin(-1E8), 0.01);
  }

}
