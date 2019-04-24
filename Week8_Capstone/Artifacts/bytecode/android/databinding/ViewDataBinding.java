public abstract class android.databinding.ViewDataBinding extends android.databinding.a {
  static int a;

  protected final android.databinding.e b;

  static {};
    Code:
       0: getstatic     #80                 // Field android/os/Build$VERSION.SDK_INT:I
       3: putstatic     #82                 // Field a:I
       6: ldc           #84                 // String binding_
       8: invokevirtual #90                 // Method java/lang/String.length:()I
      11: putstatic     #92                 // Field c:I
      14: getstatic     #82                 // Field a:I
      17: bipush        16
      19: if_icmplt     27
      22: iconst_1
      23: istore_0
      24: goto          29
      27: iconst_0
      28: istore_0
      29: iload_0
      30: putstatic     #94                 // Field d:Z
      33: new           #6                  // class android/databinding/ViewDataBinding$1
      36: dup
      37: invokespecial #97                 // Method android/databinding/ViewDataBinding$1."<init>":()V
      40: putstatic     #99                 // Field e:Landroid/databinding/ViewDataBinding$a;
      43: new           #8                  // class android/databinding/ViewDataBinding$2
      46: dup
      47: invokespecial #100                // Method android/databinding/ViewDataBinding$2."<init>":()V
      50: putstatic     #102                // Field f:Landroid/databinding/ViewDataBinding$a;
      53: new           #10                 // class android/databinding/ViewDataBinding$3
      56: dup
      57: invokespecial #103                // Method android/databinding/ViewDataBinding$3."<init>":()V
      60: putstatic     #105                // Field g:Landroid/databinding/ViewDataBinding$a;
      63: new           #12                 // class android/databinding/ViewDataBinding$4
      66: dup
      67: invokespecial #106                // Method android/databinding/ViewDataBinding$4."<init>":()V
      70: putstatic     #108                // Field h:Landroid/databinding/ViewDataBinding$a;
      73: new           #14                 // class android/databinding/ViewDataBinding$5
      76: dup
      77: invokespecial #109                // Method android/databinding/ViewDataBinding$5."<init>":()V
      80: putstatic     #111                // Field i:Landroid/databinding/b$a;
      83: new           #113                // class java/lang/ref/ReferenceQueue
      86: dup
      87: invokespecial #114                // Method java/lang/ref/ReferenceQueue."<init>":()V
      90: putstatic     #116                // Field j:Ljava/lang/ref/ReferenceQueue;
      93: getstatic     #80                 // Field android/os/Build$VERSION.SDK_INT:I
      96: bipush        19
      98: if_icmpge     108
     101: aconst_null
     102: astore_1
     103: aload_1
     104: putstatic     #118                // Field k:Landroid/view/View$OnAttachStateChangeListener;
     107: return
     108: new           #16                 // class android/databinding/ViewDataBinding$6
     111: dup
     112: invokespecial #119                // Method android/databinding/ViewDataBinding$6."<init>":()V
     115: astore_1
     116: goto          103

  protected android.databinding.ViewDataBinding(android.databinding.e, android.view.View, int);
    Code:
       0: aload_0
       1: invokespecial #122                // Method android/databinding/a."<init>":()V
       4: aload_0
       5: new           #18                 // class android/databinding/ViewDataBinding$7
       8: dup
       9: aload_0
      10: invokespecial #125                // Method android/databinding/ViewDataBinding$7."<init>":(Landroid/databinding/ViewDataBinding;)V
      13: putfield      #127                // Field l:Ljava/lang/Runnable;
      16: aload_0
      17: iconst_0
      18: putfield      #129                // Field m:Z
      21: aload_0
      22: iconst_0
      23: putfield      #131                // Field n:Z
      26: aload_0
      27: aload_1
      28: putfield      #133                // Field b:Landroid/databinding/e;
      31: aload_0
      32: iload_3
      33: anewarray     #34                 // class android/databinding/ViewDataBinding$d
      36: putfield      #135                // Field o:[Landroid/databinding/ViewDataBinding$d;
      39: aload_0
      40: aload_2
      41: putfield      #137                // Field p:Landroid/view/View;
      44: invokestatic  #143                // Method android/os/Looper.myLooper:()Landroid/os/Looper;
      47: ifnonnull     60
      50: new           #145                // class java/lang/IllegalStateException
      53: dup
      54: ldc           #147                // String DataBinding must be created in view's UI Thread
      56: invokespecial #150                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      59: athrow
      60: getstatic     #94                 // Field d:Z
      63: ifeq          86
      66: aload_0
      67: invokestatic  #156                // Method android/view/Choreographer.getInstance:()Landroid/view/Choreographer;
      70: putfield      #158                // Field s:Landroid/view/Choreographer;
      73: aload_0
      74: new           #20                 // class android/databinding/ViewDataBinding$8
      77: dup
      78: aload_0
      79: invokespecial #159                // Method android/databinding/ViewDataBinding$8."<init>":(Landroid/databinding/ViewDataBinding;)V
      82: putfield      #161                // Field t:Landroid/view/Choreographer$FrameCallback;
      85: return
      86: aload_0
      87: aconst_null
      88: putfield      #161                // Field t:Landroid/view/Choreographer$FrameCallback;
      91: aload_0
      92: new           #163                // class android/os/Handler
      95: dup
      96: invokestatic  #143                // Method android/os/Looper.myLooper:()Landroid/os/Looper;
      99: invokespecial #166                // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
     102: putfield      #168                // Field u:Landroid/os/Handler;
     105: return

  static java.lang.Runnable a(android.databinding.ViewDataBinding);
    Code:
       0: aload_0
       1: getfield      #127                // Field l:Ljava/lang/Runnable;
       4: areturn

  static boolean a(android.databinding.ViewDataBinding, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #131                // Field n:Z
       5: iload_1
       6: ireturn

  protected static java.lang.Object[] a(android.databinding.e, android.view.View, int, android.databinding.ViewDataBinding$b, android.util.SparseIntArray);
    Code:
       0: iload_2
       1: anewarray     #273                // class java/lang/Object
       4: astore        5
       6: aload_0
       7: aload_1
       8: aload         5
      10: aload_3
      11: aload         4
      13: iconst_1
      14: invokestatic  #263                // Method a:(Landroid/databinding/e;Landroid/view/View;[Ljava/lang/Object;Landroid/databinding/ViewDataBinding$b;Landroid/util/SparseIntArray;Z)V
      17: aload         5
      19: areturn

  static android.databinding.ViewDataBinding b(android.view.View);
    Code:
       0: aload_0
       1: ifnull        15
       4: aload_0
       5: getstatic     #278                // Field com/a/a/a/a$a.dataBinding:I
       8: invokevirtual #281                // Method android/view/View.getTag:(I)Ljava/lang/Object;
      11: checkcast     #2                  // class android/databinding/ViewDataBinding
      14: areturn
      15: aconst_null
      16: areturn

  static android.view.View b(android.databinding.ViewDataBinding);
    Code:
       0: aload_0
       1: getfield      #137                // Field p:Landroid/view/View;
       4: areturn

  static boolean b(android.databinding.ViewDataBinding, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #129                // Field m:Z
       5: iload_1
       6: ireturn

  static void e();
    Code:
       0: invokestatic  #284                // Method h:()V
       3: return

  static android.view.View$OnAttachStateChangeListener f();
    Code:
       0: getstatic     #118                // Field k:Landroid/view/View$OnAttachStateChangeListener;
       3: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #309                // Field v:Landroid/databinding/ViewDataBinding;
       4: ifnonnull     12
       7: aload_0
       8: invokespecial #311                // Method g:()V
      11: return
      12: aload_0
      13: getfield      #309                // Field v:Landroid/databinding/ViewDataBinding;
      16: invokevirtual #313                // Method a:()V
      19: return

  protected void a(android.view.View);
    Code:
       0: aload_1
       1: getstatic     #278                // Field com/a/a/a/a$a.dataBinding:I
       4: aload_0
       5: invokevirtual #318                // Method android/view/View.setTag:(ILjava/lang/Object;)V
       8: return

  protected abstract void b();

  public abstract boolean c();

  protected void d();
    Code:
       0: aload_0
       1: getfield      #309                // Field v:Landroid/databinding/ViewDataBinding;
       4: ifnull        15
       7: aload_0
       8: getfield      #309                // Field v:Landroid/databinding/ViewDataBinding;
      11: invokevirtual #289                // Method d:()V
      14: return
      15: aload_0
      16: monitorenter
      17: aload_0
      18: getfield      #129                // Field m:Z
      21: ifeq          27
      24: aload_0
      25: monitorexit
      26: return
      27: aload_0
      28: iconst_1
      29: putfield      #129                // Field m:Z
      32: aload_0
      33: monitorexit
      34: aload_0
      35: getfield      #320                // Field w:Landroid/arch/lifecycle/e;
      38: ifnull        63
      41: aload_0
      42: getfield      #320                // Field w:Landroid/arch/lifecycle/e;
      45: invokeinterface #326,  1          // InterfaceMethod android/arch/lifecycle/e.getLifecycle:()Landroid/arch/lifecycle/c;
      50: invokevirtual #331                // Method android/arch/lifecycle/c.a:()Landroid/arch/lifecycle/c$b;
      53: getstatic     #336                // Field android/arch/lifecycle/c$b.d:Landroid/arch/lifecycle/c$b;
      56: invokevirtual #339                // Method android/arch/lifecycle/c$b.a:(Landroid/arch/lifecycle/c$b;)Z
      59: ifne          63
      62: return
      63: getstatic     #94                 // Field d:Z
      66: ifeq          81
      69: aload_0
      70: getfield      #158                // Field s:Landroid/view/Choreographer;
      73: aload_0
      74: getfield      #161                // Field t:Landroid/view/Choreographer$FrameCallback;
      77: invokevirtual #343                // Method android/view/Choreographer.postFrameCallback:(Landroid/view/Choreographer$FrameCallback;)V
      80: return
      81: aload_0
      82: getfield      #168                // Field u:Landroid/os/Handler;
      85: aload_0
      86: getfield      #127                // Field l:Ljava/lang/Runnable;
      89: invokevirtual #347                // Method android/os/Handler.post:(Ljava/lang/Runnable;)Z
      92: pop
      93: return
      94: astore_1
      95: aload_0
      96: monitorexit
      97: aload_1
      98: athrow
    Exception table:
       from    to  target type
          17    26    94   any
          27    34    94   any
          95    97    94   any
}
