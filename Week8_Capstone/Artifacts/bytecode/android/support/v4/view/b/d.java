abstract class android.support.v4.view.b.d implements android.view.animation.Interpolator {
  protected android.support.v4.view.b.d(float[]);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:[F
       9: aload_0
      10: fconst_1
      11: aload_0
      12: getfield      #17                 // Field a:[F
      15: arraylength
      16: iconst_1
      17: isub
      18: i2f
      19: fdiv
      20: putfield      #19                 // Field b:F
      23: return

  public float getInterpolation(float);
    Code:
       0: fload_1
       1: fconst_1
       2: fcmpl
       3: iflt          8
       6: fconst_1
       7: freturn
       8: fload_1
       9: fconst_0
      10: fcmpg
      11: ifgt          16
      14: fconst_0
      15: freturn
      16: aload_0
      17: getfield      #17                 // Field a:[F
      20: arraylength
      21: iconst_1
      22: isub
      23: i2f
      24: fload_1
      25: fmul
      26: f2i
      27: aload_0
      28: getfield      #17                 // Field a:[F
      31: arraylength
      32: iconst_2
      33: isub
      34: invokestatic  #28                 // Method java/lang/Math.min:(II)I
      37: istore_2
      38: fload_1
      39: iload_2
      40: i2f
      41: aload_0
      42: getfield      #19                 // Field b:F
      45: fmul
      46: fsub
      47: aload_0
      48: getfield      #19                 // Field b:F
      51: fdiv
      52: fstore_1
      53: aload_0
      54: getfield      #17                 // Field a:[F
      57: iload_2
      58: faload
      59: fload_1
      60: aload_0
      61: getfield      #17                 // Field a:[F
      64: iload_2
      65: iconst_1
      66: iadd
      67: faload
      68: aload_0
      69: getfield      #17                 // Field a:[F
      72: iload_2
      73: faload
      74: fsub
      75: fmul
      76: fadd
      77: freturn
}
