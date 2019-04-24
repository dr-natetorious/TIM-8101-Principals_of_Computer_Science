public abstract class android.support.v7.widget.RecyclerView$f {
  public android.support.v7.widget.RecyclerView$f();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #28                 // Field a:Landroid/support/v7/widget/RecyclerView$f$b;
       9: aload_0
      10: new           #30                 // class java/util/ArrayList
      13: dup
      14: invokespecial #31                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #33                 // Field b:Ljava/util/ArrayList;
      20: aload_0
      21: ldc2_w        #34                 // long 120l
      24: putfield      #37                 // Field c:J
      27: aload_0
      28: ldc2_w        #34                 // long 120l
      31: putfield      #39                 // Field d:J
      34: aload_0
      35: ldc2_w        #40                 // long 250l
      38: putfield      #43                 // Field e:J
      41: aload_0
      42: ldc2_w        #40                 // long 250l
      45: putfield      #45                 // Field f:J
      48: return

  static int e(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: invokestatic  #51                 // Method android/support/v7/widget/RecyclerView$x.d:(Landroid/support/v7/widget/RecyclerView$x;)I
       4: bipush        14
       6: iand
       7: istore_2
       8: aload_0
       9: invokevirtual #55                 // Method android/support/v7/widget/RecyclerView$x.n:()Z
      12: ifeq          17
      15: iconst_4
      16: ireturn
      17: iload_2
      18: istore_1
      19: iload_2
      20: iconst_4
      21: iand
      22: ifne          65
      25: aload_0
      26: invokevirtual #58                 // Method android/support/v7/widget/RecyclerView$x.f:()I
      29: istore_3
      30: aload_0
      31: invokevirtual #60                 // Method android/support/v7/widget/RecyclerView$x.e:()I
      34: istore        4
      36: iload_2
      37: istore_1
      38: iload_3
      39: iconst_m1
      40: if_icmpeq     65
      43: iload_2
      44: istore_1
      45: iload         4
      47: iconst_m1
      48: if_icmpeq     65
      51: iload_2
      52: istore_1
      53: iload_3
      54: iload         4
      56: if_icmpeq     65
      59: iload_2
      60: sipush        2048
      63: ior
      64: istore_1
      65: iload_1
      66: ireturn

  public android.support.v7.widget.RecyclerView$f$c a(android.support.v7.widget.RecyclerView$u, android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: invokevirtual #65                 // Method j:()Landroid/support/v7/widget/RecyclerView$f$c;
       4: aload_2
       5: invokevirtual #68                 // Method android/support/v7/widget/RecyclerView$f$c.a:(Landroid/support/v7/widget/RecyclerView$x;)Landroid/support/v7/widget/RecyclerView$f$c;
       8: areturn

  public android.support.v7.widget.RecyclerView$f$c a(android.support.v7.widget.RecyclerView$u, android.support.v7.widget.RecyclerView$x, int, java.util.List<java.lang.Object>);
    Code:
       0: aload_0
       1: invokevirtual #65                 // Method j:()Landroid/support/v7/widget/RecyclerView$f$c;
       4: aload_2
       5: invokevirtual #68                 // Method android/support/v7/widget/RecyclerView$f$c.a:(Landroid/support/v7/widget/RecyclerView$x;)Landroid/support/v7/widget/RecyclerView$f$c;
       8: areturn

  public abstract void a();

  void a(android.support.v7.widget.RecyclerView$f$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #28                 // Field a:Landroid/support/v7/widget/RecyclerView$f$b;
       5: return

  public abstract boolean a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);

  public abstract boolean a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);

  public boolean a(android.support.v7.widget.RecyclerView$x, java.util.List<java.lang.Object>);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #79                 // Method h:(Landroid/support/v7/widget/RecyclerView$x;)Z
       5: ireturn

  public abstract boolean b();

  public abstract boolean b(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);

  public abstract boolean c(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c, android.support.v7.widget.RecyclerView$f$c);

  public abstract void d();

  public abstract void d(android.support.v7.widget.RecyclerView$x);

  public long e();
    Code:
       0: aload_0
       1: getfield      #43                 // Field e:J
       4: lreturn

  public long f();
    Code:
       0: aload_0
       1: getfield      #37                 // Field c:J
       4: lreturn

  public final void f(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #85                 // Method g:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: aload_0
       6: getfield      #28                 // Field a:Landroid/support/v7/widget/RecyclerView$f$b;
       9: ifnull        22
      12: aload_0
      13: getfield      #28                 // Field a:Landroid/support/v7/widget/RecyclerView$f$b;
      16: aload_1
      17: invokeinterface #87,  2           // InterfaceMethod android/support/v7/widget/RecyclerView$f$b.a:(Landroid/support/v7/widget/RecyclerView$x;)V
      22: return

  public long g();
    Code:
       0: aload_0
       1: getfield      #39                 // Field d:J
       4: lreturn

  public void g(android.support.v7.widget.RecyclerView$x);
    Code:
       0: return

  public long h();
    Code:
       0: aload_0
       1: getfield      #45                 // Field f:J
       4: lreturn

  public boolean h(android.support.v7.widget.RecyclerView$x);
    Code:
       0: iconst_1
       1: ireturn

  public final void i();
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #91                 // Method java/util/ArrayList.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     38
      15: aload_0
      16: getfield      #33                 // Field b:Ljava/util/ArrayList;
      19: iload_1
      20: invokevirtual #95                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #9                  // class android/support/v7/widget/RecyclerView$f$a
      26: invokeinterface #97,  1           // InterfaceMethod android/support/v7/widget/RecyclerView$f$a.a:()V
      31: iload_1
      32: iconst_1
      33: iadd
      34: istore_1
      35: goto          10
      38: aload_0
      39: getfield      #33                 // Field b:Ljava/util/ArrayList;
      42: invokevirtual #100                // Method java/util/ArrayList.clear:()V
      45: return

  public android.support.v7.widget.RecyclerView$f$c j();
    Code:
       0: new           #15                 // class android/support/v7/widget/RecyclerView$f$c
       3: dup
       4: invokespecial #101                // Method android/support/v7/widget/RecyclerView$f$c."<init>":()V
       7: areturn
}
