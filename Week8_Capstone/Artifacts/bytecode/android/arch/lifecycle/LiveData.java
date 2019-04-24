public abstract class android.arch.lifecycle.LiveData<T> {
  static {};
    Code:
       0: new           #5                  // class java/lang/Object
       3: dup
       4: invokespecial #27                 // Method java/lang/Object."<init>":()V
       7: putstatic     #29                 // Field a:Ljava/lang/Object;
      10: return

  static int a(android.arch.lifecycle.LiveData);
    Code:
       0: aload_0
       1: getfield      #33                 // Field c:I
       4: ireturn

  static int a(android.arch.lifecycle.LiveData, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #33                 // Field c:I
       5: iload_1
       6: ireturn

  static void a(android.arch.lifecycle.LiveData, android.arch.lifecycle.LiveData$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #61                 // Method b:(Landroid/arch/lifecycle/LiveData$a;)V
       5: return

  public T a();
    Code:
       0: aload_0
       1: getfield      #51                 // Field d:Ljava/lang/Object;
       4: astore_1
       5: aload_1
       6: getstatic     #29                 // Field a:Ljava/lang/Object;
       9: if_acmpeq     14
      12: aload_1
      13: areturn
      14: aconst_null
      15: areturn

  public void a(android.arch.lifecycle.e, android.arch.lifecycle.k<T>);
    Code:
       0: aload_1
       1: invokeinterface #125,  1          // InterfaceMethod android/arch/lifecycle/e.getLifecycle:()Landroid/arch/lifecycle/c;
       6: invokevirtual #130                // Method android/arch/lifecycle/c.a:()Landroid/arch/lifecycle/c$b;
       9: getstatic     #135                // Field android/arch/lifecycle/c$b.a:Landroid/arch/lifecycle/c$b;
      12: if_acmpne     16
      15: return
      16: new           #7                  // class android/arch/lifecycle/LiveData$LifecycleBoundObserver
      19: dup
      20: aload_0
      21: aload_1
      22: aload_2
      23: invokespecial #138                // Method android/arch/lifecycle/LiveData$LifecycleBoundObserver."<init>":(Landroid/arch/lifecycle/LiveData;Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/k;)V
      26: astore_3
      27: aload_0
      28: getfield      #98                 // Field b:Landroid/arch/a/b/b;
      31: aload_2
      32: aload_3
      33: invokevirtual #141                // Method android/arch/a/b/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      36: checkcast     #10                 // class android/arch/lifecycle/LiveData$a
      39: astore_2
      40: aload_2
      41: ifnull        62
      44: aload_2
      45: aload_1
      46: invokevirtual #144                // Method android/arch/lifecycle/LiveData$a.a:(Landroid/arch/lifecycle/e;)Z
      49: ifne          62
      52: new           #146                // class java/lang/IllegalArgumentException
      55: dup
      56: ldc           #148                // String Cannot add the same observer with different lifecycles
      58: invokespecial #149                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      61: athrow
      62: aload_2
      63: ifnull        67
      66: return
      67: aload_1
      68: invokeinterface #125,  1          // InterfaceMethod android/arch/lifecycle/e.getLifecycle:()Landroid/arch/lifecycle/c;
      73: aload_3
      74: invokevirtual #152                // Method android/arch/lifecycle/c.a:(Landroid/arch/lifecycle/d;)V
      77: return

  public void a(android.arch.lifecycle.k<T>);
    Code:
       0: ldc           #156                // String removeObserver
       2: invokestatic  #158                // Method a:(Ljava/lang/String;)V
       5: aload_0
       6: getfield      #98                 // Field b:Landroid/arch/a/b/b;
       9: aload_1
      10: invokevirtual #161                // Method android/arch/a/b/b.b:(Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #10                 // class android/arch/lifecycle/LiveData$a
      16: astore_1
      17: aload_1
      18: ifnonnull     22
      21: return
      22: aload_1
      23: invokevirtual #163                // Method android/arch/lifecycle/LiveData$a.b:()V
      26: aload_1
      27: iconst_0
      28: invokevirtual #43                 // Method android/arch/lifecycle/LiveData$a.a:(Z)V
      31: return

  protected void b();
    Code:
       0: return

  protected void c();
    Code:
       0: return

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #33                 // Field c:I
       4: ifle          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn
}
