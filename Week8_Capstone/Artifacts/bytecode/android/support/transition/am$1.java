final class android.support.transition.am$1 extends android.util.Property<android.view.View, java.lang.Float> {
  android.support.transition.am$1(java.lang.Class, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #11                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
       6: return

  public java.lang.Float a(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #18                 // Method android/support/transition/am.c:(Landroid/view/View;)F
       4: invokestatic  #24                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
       7: areturn

  public void a(android.view.View, java.lang.Float);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #29                 // Method java/lang/Float.floatValue:()F
       5: invokestatic  #32                 // Method android/support/transition/am.a:(Landroid/view/View;F)V
       8: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #36                 // class android/view/View
       5: invokevirtual #38                 // Method a:(Landroid/view/View;)Ljava/lang/Float;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #36                 // class android/view/View
       5: aload_2
       6: checkcast     #20                 // class java/lang/Float
       9: invokevirtual #42                 // Method a:(Landroid/view/View;Ljava/lang/Float;)V
      12: return
}
