public class org.apmem.tools.layouts.FlowLayout$a extends android.view.ViewGroup$MarginLayoutParams {
  public org.apmem.tools.layouts.FlowLayout$a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #50                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(II)V
       6: aload_0
       7: iconst_0
       8: putfield      #52                 // Field a:Z
      11: aload_0
      12: iconst_0
      13: putfield      #54                 // Field b:I
      16: aload_0
      17: ldc           #55                 // float -1.0f
      19: putfield      #57                 // Field c:F
      22: return

  public org.apmem.tools.layouts.FlowLayout$a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #61                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: iconst_0
       8: putfield      #52                 // Field a:Z
      11: aload_0
      12: iconst_0
      13: putfield      #54                 // Field b:I
      16: aload_0
      17: ldc           #55                 // float -1.0f
      19: putfield      #57                 // Field c:F
      22: aload_0
      23: aload_1
      24: aload_2
      25: invokespecial #63                 // Method a:(Landroid/content/Context;Landroid/util/AttributeSet;)V
      28: return

  public org.apmem.tools.layouts.FlowLayout$a(android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #66                 // Method android/view/ViewGroup$MarginLayoutParams."<init>":(Landroid/view/ViewGroup$LayoutParams;)V
       5: aload_0
       6: iconst_0
       7: putfield      #52                 // Field a:Z
      10: aload_0
      11: iconst_0
      12: putfield      #54                 // Field b:I
      15: aload_0
      16: ldc           #55                 // float -1.0f
      18: putfield      #57                 // Field c:F
      21: return

  static int a(org.apmem.tools.layouts.FlowLayout$a);
    Code:
       0: aload_0
       1: getfield      #69                 // Field h:I
       4: ireturn

  static int a(org.apmem.tools.layouts.FlowLayout$a, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #72                 // Field j:I
       5: iload_1
       6: ireturn

  static int b(org.apmem.tools.layouts.FlowLayout$a);
    Code:
       0: aload_0
       1: getfield      #113                // Field i:I
       4: ireturn

  void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #116                // Field d:I
       5: return

  void a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #69                 // Field h:I
       5: aload_0
       6: iload_2
       7: putfield      #113                // Field i:I
      10: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #54                 // Field b:I
       4: ifeq          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #119                // Field e:I
       5: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #57                 // Field c:F
       4: fconst_0
       5: fcmpl
       6: iflt          11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  int c();
    Code:
       0: aload_0
       1: getfield      #116                // Field d:I
       4: ireturn

  void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #122                // Field f:I
       5: return

  int d();
    Code:
       0: aload_0
       1: getfield      #119                // Field e:I
       4: ireturn

  void d(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #124                // Field g:I
       5: return

  int e();
    Code:
       0: aload_0
       1: getfield      #122                // Field f:I
       4: ireturn

  int f();
    Code:
       0: aload_0
       1: getfield      #124                // Field g:I
       4: ireturn

  int g();
    Code:
       0: aload_0
       1: getfield      #72                 // Field j:I
       4: ifne          21
       7: aload_0
       8: getfield      #127                // Field leftMargin:I
      11: istore_1
      12: aload_0
      13: getfield      #130                // Field rightMargin:I
      16: istore_2
      17: iload_1
      18: iload_2
      19: iadd
      20: ireturn
      21: aload_0
      22: getfield      #133                // Field topMargin:I
      25: istore_1
      26: aload_0
      27: getfield      #136                // Field bottomMargin:I
      30: istore_2
      31: goto          17

  int h();
    Code:
       0: aload_0
       1: getfield      #72                 // Field j:I
       4: ifne          21
       7: aload_0
       8: getfield      #133                // Field topMargin:I
      11: istore_1
      12: aload_0
      13: getfield      #136                // Field bottomMargin:I
      16: istore_2
      17: iload_1
      18: iload_2
      19: iadd
      20: ireturn
      21: aload_0
      22: getfield      #127                // Field leftMargin:I
      25: istore_1
      26: aload_0
      27: getfield      #130                // Field rightMargin:I
      30: istore_2
      31: goto          17

  public int i();
    Code:
       0: aload_0
       1: getfield      #54                 // Field b:I
       4: ireturn

  public float j();
    Code:
       0: aload_0
       1: getfield      #57                 // Field c:F
       4: freturn

  public boolean k();
    Code:
       0: aload_0
       1: getfield      #52                 // Field a:Z
       4: ireturn
}
