final class android.support.transition.u$1 extends android.support.transition.l {
  android.support.transition.u$1();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method android/support/transition/l."<init>":()V
       4: return

  public android.graphics.Path a(float, float, float, float);
    Code:
       0: new           #15                 // class android/graphics/Path
       3: dup
       4: invokespecial #16                 // Method android/graphics/Path."<init>":()V
       7: astore        5
       9: aload         5
      11: fload_1
      12: fload_2
      13: invokevirtual #20                 // Method android/graphics/Path.moveTo:(FF)V
      16: aload         5
      18: fload_3
      19: fload         4
      21: invokevirtual #23                 // Method android/graphics/Path.lineTo:(FF)V
      24: aload         5
      26: areturn
}
