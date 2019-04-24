public class android.support.constraint.a.a.k extends android.support.constraint.a.a.l {
  float a;

  public android.support.constraint.a.a.k();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method android/support/constraint/a/a/l."<init>":()V
       4: aload_0
       5: fconst_0
       6: putfield      #12                 // Field a:F
       9: return

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field i:I
       4: ifeq          17
       7: aload_0
       8: getfield      #12                 // Field a:F
      11: iload_1
      12: i2f
      13: fcmpl
      14: ifeq          39
      17: aload_0
      18: iload_1
      19: i2f
      20: putfield      #12                 // Field a:F
      23: aload_0
      24: getfield      #18                 // Field i:I
      27: iconst_1
      28: if_icmpne     35
      31: aload_0
      32: invokevirtual #21                 // Method e:()V
      35: aload_0
      36: invokevirtual #24                 // Method f:()V
      39: return

  public void b();
    Code:
       0: aload_0
       1: invokespecial #27                 // Method android/support/constraint/a/a/l.b:()V
       4: aload_0
       5: fconst_0
       6: putfield      #12                 // Field a:F
       9: return

  public void c();
    Code:
       0: aload_0
       1: iconst_2
       2: putfield      #18                 // Field i:I
       5: return
}
