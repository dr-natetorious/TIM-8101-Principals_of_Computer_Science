class android.support.design.widget.r extends android.widget.ImageButton {
  public android.support.design.widget.r(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #11                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.widget.r(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #15                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.widget.r(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #16                 // Method android/widget/ImageButton."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: aload_0
       9: invokevirtual #20                 // Method getVisibility:()I
      12: putfield      #22                 // Field a:I
      15: return

  final void a(int, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #27                 // Method android/widget/ImageButton.setVisibility:(I)V
       5: iload_2
       6: ifeq          14
       9: aload_0
      10: iload_1
      11: putfield      #22                 // Field a:I
      14: return

  final int getUserSetVisibility();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:I
       4: ireturn

  public void setVisibility(int);
    Code:
       0: aload_0
       1: iload_1
       2: iconst_1
       3: invokevirtual #30                 // Method a:(IZ)V
       6: return
}
