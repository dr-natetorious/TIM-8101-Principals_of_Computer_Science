public class android.support.v7.view.h {
  final java.util.ArrayList<android.support.v4.view.x> a;

  android.support.v4.view.y b;

  public android.support.v7.view.h();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: ldc2_w        #24                 // long -1l
       8: putfield      #27                 // Field c:J
      11: aload_0
      12: new           #6                  // class android/support/v7/view/h$1
      15: dup
      16: aload_0
      17: invokespecial #30                 // Method android/support/v7/view/h$1."<init>":(Landroid/support/v7/view/h;)V
      20: putfield      #32                 // Field f:Landroid/support/v4/view/z;
      23: aload_0
      24: new           #34                 // class java/util/ArrayList
      27: dup
      28: invokespecial #35                 // Method java/util/ArrayList."<init>":()V
      31: putfield      #37                 // Field a:Ljava/util/ArrayList;
      34: return

  public android.support.v7.view.h a(long);
    Code:
       0: aload_0
       1: getfield      #41                 // Field e:Z
       4: ifne          12
       7: aload_0
       8: lload_1
       9: putfield      #27                 // Field c:J
      12: aload_0
      13: areturn

  public android.support.v7.view.h a(android.support.v4.view.x);
    Code:
       0: aload_0
       1: getfield      #41                 // Field e:Z
       4: ifne          16
       7: aload_0
       8: getfield      #37                 // Field a:Ljava/util/ArrayList;
      11: aload_1
      12: invokevirtual #46                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      15: pop
      16: aload_0
      17: areturn

  public android.support.v7.view.h a(android.support.v4.view.x, android.support.v4.view.x);
    Code:
       0: aload_0
       1: getfield      #37                 // Field a:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #46                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       8: pop
       9: aload_2
      10: aload_1
      11: invokevirtual #52                 // Method android/support/v4/view/x.a:()J
      14: invokevirtual #55                 // Method android/support/v4/view/x.b:(J)Landroid/support/v4/view/x;
      17: pop
      18: aload_0
      19: getfield      #37                 // Field a:Ljava/util/ArrayList;
      22: aload_2
      23: invokevirtual #46                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      26: pop
      27: aload_0
      28: areturn

  public android.support.v7.view.h a(android.support.v4.view.y);
    Code:
       0: aload_0
       1: getfield      #41                 // Field e:Z
       4: ifne          12
       7: aload_0
       8: aload_1
       9: putfield      #58                 // Field b:Landroid/support/v4/view/y;
      12: aload_0
      13: areturn

  public android.support.v7.view.h a(android.view.animation.Interpolator);
    Code:
       0: aload_0
       1: getfield      #41                 // Field e:Z
       4: ifne          12
       7: aload_0
       8: aload_1
       9: putfield      #61                 // Field d:Landroid/view/animation/Interpolator;
      12: aload_0
      13: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #41                 // Field e:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: getfield      #37                 // Field a:Ljava/util/ArrayList;
      12: invokevirtual #65                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      15: astore_1
      16: aload_1
      17: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      22: ifeq          92
      25: aload_1
      26: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      31: checkcast     #49                 // class android/support/v4/view/x
      34: astore_2
      35: aload_0
      36: getfield      #27                 // Field c:J
      39: lconst_0
      40: lcmp
      41: iflt          53
      44: aload_2
      45: aload_0
      46: getfield      #27                 // Field c:J
      49: invokevirtual #77                 // Method android/support/v4/view/x.a:(J)Landroid/support/v4/view/x;
      52: pop
      53: aload_0
      54: getfield      #61                 // Field d:Landroid/view/animation/Interpolator;
      57: ifnull        69
      60: aload_2
      61: aload_0
      62: getfield      #61                 // Field d:Landroid/view/animation/Interpolator;
      65: invokevirtual #80                 // Method android/support/v4/view/x.a:(Landroid/view/animation/Interpolator;)Landroid/support/v4/view/x;
      68: pop
      69: aload_0
      70: getfield      #58                 // Field b:Landroid/support/v4/view/y;
      73: ifnull        85
      76: aload_2
      77: aload_0
      78: getfield      #32                 // Field f:Landroid/support/v4/view/z;
      81: invokevirtual #83                 // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      84: pop
      85: aload_2
      86: invokevirtual #85                 // Method android/support/v4/view/x.c:()V
      89: goto          16
      92: aload_0
      93: iconst_1
      94: putfield      #41                 // Field e:Z
      97: return

  void b();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #41                 // Field e:Z
       5: return

  public void c();
    Code:
       0: aload_0
       1: getfield      #41                 // Field e:Z
       4: ifne          8
       7: return
       8: aload_0
       9: getfield      #37                 // Field a:Ljava/util/ArrayList;
      12: invokevirtual #65                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      15: astore_1
      16: aload_1
      17: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      22: ifeq          40
      25: aload_1
      26: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      31: checkcast     #49                 // class android/support/v4/view/x
      34: invokevirtual #87                 // Method android/support/v4/view/x.b:()V
      37: goto          16
      40: aload_0
      41: iconst_0
      42: putfield      #41                 // Field e:Z
      45: return
}
