public class android.support.transition.w {
  static {};
    Code:
       0: new           #20                 // class android/support/transition/e
       3: dup
       4: invokespecial #23                 // Method android/support/transition/e."<init>":()V
       7: putstatic     #25                 // Field a:Landroid/support/transition/u;
      10: new           #27                 // class java/lang/ThreadLocal
      13: dup
      14: invokespecial #28                 // Method java/lang/ThreadLocal."<init>":()V
      17: putstatic     #30                 // Field b:Ljava/lang/ThreadLocal;
      20: new           #32                 // class java/util/ArrayList
      23: dup
      24: invokespecial #33                 // Method java/util/ArrayList."<init>":()V
      27: putstatic     #35                 // Field c:Ljava/util/ArrayList;
      30: return

  static android.support.v4.g.a<android.view.ViewGroup, java.util.ArrayList<android.support.transition.u>> a();
    Code:
       0: getstatic     #30                 // Field b:Ljava/lang/ThreadLocal;
       3: invokevirtual #41                 // Method java/lang/ThreadLocal.get:()Ljava/lang/Object;
       6: checkcast     #43                 // class java/lang/ref/WeakReference
       9: astore_1
      10: aload_1
      11: ifnull        23
      14: aload_1
      15: astore_0
      16: aload_1
      17: invokevirtual #44                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      20: ifnonnull     45
      23: new           #43                 // class java/lang/ref/WeakReference
      26: dup
      27: new           #46                 // class android/support/v4/g/a
      30: dup
      31: invokespecial #47                 // Method android/support/v4/g/a."<init>":()V
      34: invokespecial #50                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      37: astore_0
      38: getstatic     #30                 // Field b:Ljava/lang/ThreadLocal;
      41: aload_0
      42: invokevirtual #53                 // Method java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
      45: aload_0
      46: invokevirtual #44                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      49: checkcast     #46                 // class android/support/v4/g/a
      52: areturn

  public static void a(android.view.ViewGroup, android.support.transition.u);
    Code:
       0: getstatic     #35                 // Field c:Ljava/util/ArrayList;
       3: aload_0
       4: invokevirtual #60                 // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
       7: ifne          55
      10: aload_0
      11: invokestatic  #66                 // Method android/support/v4/view/s.w:(Landroid/view/View;)Z
      14: ifeq          55
      17: getstatic     #35                 // Field c:Ljava/util/ArrayList;
      20: aload_0
      21: invokevirtual #69                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      24: pop
      25: aload_1
      26: astore_2
      27: aload_1
      28: ifnonnull     35
      31: getstatic     #25                 // Field a:Landroid/support/transition/u;
      34: astore_2
      35: aload_2
      36: invokevirtual #75                 // Method android/support/transition/u.m:()Landroid/support/transition/u;
      39: astore_1
      40: aload_0
      41: aload_1
      42: invokestatic  #77                 // Method c:(Landroid/view/ViewGroup;Landroid/support/transition/u;)V
      45: aload_0
      46: aconst_null
      47: invokestatic  #82                 // Method android/support/transition/t.a:(Landroid/view/View;Landroid/support/transition/t;)V
      50: aload_0
      51: aload_1
      52: invokestatic  #84                 // Method b:(Landroid/view/ViewGroup;Landroid/support/transition/u;)V
      55: return

  static java.util.ArrayList b();
    Code:
       0: getstatic     #35                 // Field c:Ljava/util/ArrayList;
       3: areturn
}
