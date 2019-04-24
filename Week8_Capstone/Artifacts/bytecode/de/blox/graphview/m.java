public abstract class de.blox.graphview.m {
  public final android.view.View a;

  public de.blox.graphview.m(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: aload_1
       5: ifnonnull     18
       8: new           #13                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #15                 // String itemView may not be null
      14: invokespecial #18                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: aload_1
      20: putfield      #20                 // Field a:Landroid/view/View;
      23: return
}
