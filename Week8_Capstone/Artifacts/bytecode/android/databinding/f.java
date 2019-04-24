public class android.databinding.f {
  static {};
    Code:
       0: new           #12                 // class android/databinding/d
       3: dup
       4: invokespecial #15                 // Method android/databinding/d."<init>":()V
       7: putstatic     #17                 // Field a:Landroid/databinding/c;
      10: return

  static <T extends android.databinding.ViewDataBinding> T a(android.databinding.e, android.view.View, int);
    Code:
       0: getstatic     #17                 // Field a:Landroid/databinding/c;
       3: aload_0
       4: aload_1
       5: iload_2
       6: invokevirtual #23                 // Method android/databinding/c.a:(Landroid/databinding/e;Landroid/view/View;I)Landroid/databinding/ViewDataBinding;
       9: areturn

  static <T extends android.databinding.ViewDataBinding> T a(android.databinding.e, android.view.View[], int);
    Code:
       0: getstatic     #17                 // Field a:Landroid/databinding/c;
       3: aload_0
       4: aload_1
       5: iload_2
       6: invokevirtual #28                 // Method android/databinding/c.a:(Landroid/databinding/e;[Landroid/view/View;I)Landroid/databinding/ViewDataBinding;
       9: areturn

  public static <T extends android.databinding.ViewDataBinding> T a(android.view.View);
    Code:
       0: aload_0
       1: getstatic     #32                 // Field b:Landroid/databinding/e;
       4: invokestatic  #35                 // Method a:(Landroid/view/View;Landroid/databinding/e;)Landroid/databinding/ViewDataBinding;
       7: areturn

  public static <T extends android.databinding.ViewDataBinding> T a(android.view.View, android.databinding.e);
    Code:
       0: aload_0
       1: invokestatic  #38                 // Method b:(Landroid/view/View;)Landroid/databinding/ViewDataBinding;
       4: astore_3
       5: aload_3
       6: ifnull        11
       9: aload_3
      10: areturn
      11: aload_0
      12: invokevirtual #44                 // Method android/view/View.getTag:()Ljava/lang/Object;
      15: astore_3
      16: aload_3
      17: instanceof    #46                 // class java/lang/String
      20: ifne          33
      23: new           #48                 // class java/lang/IllegalArgumentException
      26: dup
      27: ldc           #50                 // String View is not a binding layout
      29: invokespecial #53                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      32: athrow
      33: aload_3
      34: checkcast     #46                 // class java/lang/String
      37: astore        4
      39: getstatic     #17                 // Field a:Landroid/databinding/c;
      42: aload         4
      44: invokevirtual #56                 // Method android/databinding/c.a:(Ljava/lang/String;)I
      47: istore_2
      48: iload_2
      49: ifne          85
      52: new           #58                 // class java/lang/StringBuilder
      55: dup
      56: invokespecial #59                 // Method java/lang/StringBuilder."<init>":()V
      59: astore_0
      60: aload_0
      61: ldc           #61                 // String View is not a binding layout. Tag:
      63: invokevirtual #65                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      66: pop
      67: aload_0
      68: aload_3
      69: invokevirtual #68                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      72: pop
      73: new           #48                 // class java/lang/IllegalArgumentException
      76: dup
      77: aload_0
      78: invokevirtual #72                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      81: invokespecial #53                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      84: athrow
      85: getstatic     #17                 // Field a:Landroid/databinding/c;
      88: aload_1
      89: aload_0
      90: iload_2
      91: invokevirtual #23                 // Method android/databinding/c.a:(Landroid/databinding/e;Landroid/view/View;I)Landroid/databinding/ViewDataBinding;
      94: areturn

  public static <T extends android.databinding.ViewDataBinding> T b(android.view.View);
    Code:
       0: aload_0
       1: invokestatic  #76                 // Method android/databinding/ViewDataBinding.b:(Landroid/view/View;)Landroid/databinding/ViewDataBinding;
       4: areturn
}
