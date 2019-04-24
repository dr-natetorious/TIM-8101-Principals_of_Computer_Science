public class android.support.constraint.a.a.g extends android.support.constraint.a.a.d {
  protected android.support.constraint.a.a.d[] ab;

  protected int ac;

  public android.support.constraint.a.a.g();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/support/constraint/a/a/d."<init>":()V
       4: aload_0
       5: iconst_4
       6: anewarray     #4                  // class android/support/constraint/a/a/d
       9: putfield      #14                 // Field ab:[Landroid/support/constraint/a/a/d;
      12: aload_0
      13: iconst_0
      14: putfield      #16                 // Field ac:I
      17: return

  public void H();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #16                 // Field ac:I
       5: return

  public void b(android.support.constraint.a.a.d);
    Code:
       0: aload_0
       1: getfield      #16                 // Field ac:I
       4: iconst_1
       5: iadd
       6: aload_0
       7: getfield      #14                 // Field ab:[Landroid/support/constraint/a/a/d;
      10: arraylength
      11: if_icmple     35
      14: aload_0
      15: aload_0
      16: getfield      #14                 // Field ab:[Landroid/support/constraint/a/a/d;
      19: aload_0
      20: getfield      #14                 // Field ab:[Landroid/support/constraint/a/a/d;
      23: arraylength
      24: iconst_2
      25: imul
      26: invokestatic  #26                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
      29: checkcast     #27                 // class "[Landroid/support/constraint/a/a/d;"
      32: putfield      #14                 // Field ab:[Landroid/support/constraint/a/a/d;
      35: aload_0
      36: getfield      #14                 // Field ab:[Landroid/support/constraint/a/a/d;
      39: aload_0
      40: getfield      #16                 // Field ac:I
      43: aload_1
      44: aastore
      45: aload_0
      46: aload_0
      47: getfield      #16                 // Field ac:I
      50: iconst_1
      51: iadd
      52: putfield      #16                 // Field ac:I
      55: return
}
