public class android.support.v4.b.b$b {
  public char a;

  public float[] b;

  android.support.v4.b.b$b(char, float[]);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #17                 // Field a:C
       9: aload_0
      10: aload_2
      11: putfield      #19                 // Field b:[F
      14: return

  android.support.v4.b.b$b(android.support.v4.b.b$b);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: getfield      #17                 // Field a:C
       9: putfield      #17                 // Field a:C
      12: aload_0
      13: aload_1
      14: getfield      #19                 // Field b:[F
      17: iconst_0
      18: aload_1
      19: getfield      #19                 // Field b:[F
      22: arraylength
      23: invokestatic  #24                 // Method android/support/v4/b/b.a:([FII)[F
      26: putfield      #19                 // Field b:[F
      29: return

  public static void a(android.support.v4.b.b$b[], android.graphics.Path);
    Code:
       0: bipush        6
       2: newarray       float
       4: astore        4
       6: bipush        109
       8: istore_2
       9: iconst_0
      10: istore_3
      11: iload_3
      12: aload_0
      13: arraylength
      14: if_icmpge     50
      17: aload_1
      18: aload         4
      20: iload_2
      21: aload_0
      22: iload_3
      23: aaload
      24: getfield      #17                 // Field a:C
      27: aload_0
      28: iload_3
      29: aaload
      30: getfield      #19                 // Field b:[F
      33: invokestatic  #134                // Method a:(Landroid/graphics/Path;[FCC[F)V
      36: aload_0
      37: iload_3
      38: aaload
      39: getfield      #17                 // Field a:C
      42: istore_2
      43: iload_3
      44: iconst_1
      45: iadd
      46: istore_3
      47: goto          11
      50: return

  public void a(android.support.v4.b.b$b, android.support.v4.b.b$b, float);
    Code:
       0: iconst_0
       1: istore        4
       3: iload         4
       5: aload_1
       6: getfield      #19                 // Field b:[F
       9: arraylength
      10: if_icmpge     50
      13: aload_0
      14: getfield      #19                 // Field b:[F
      17: iload         4
      19: aload_1
      20: getfield      #19                 // Field b:[F
      23: iload         4
      25: faload
      26: fconst_1
      27: fload_3
      28: fsub
      29: fmul
      30: aload_2
      31: getfield      #19                 // Field b:[F
      34: iload         4
      36: faload
      37: fload_3
      38: fmul
      39: fadd
      40: fastore
      41: iload         4
      43: iconst_1
      44: iadd
      45: istore        4
      47: goto          3
      50: return
}
