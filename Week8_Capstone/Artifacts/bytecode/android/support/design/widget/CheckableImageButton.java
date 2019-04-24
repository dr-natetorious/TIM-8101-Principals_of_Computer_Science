public class android.support.design.widget.CheckableImageButton extends android.support.v7.widget.p implements android.widget.Checkable {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #15                 // int 16842912
       7: iastore
       8: putstatic     #17                 // Field a:[I
      11: return

  public android.support.design.widget.CheckableImageButton(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #23                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.widget.CheckableImageButton(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #29                 // Field android/support/v7/a/a$a.imageButtonStyle:I
       6: invokespecial #32                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.design.widget.CheckableImageButton(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #33                 // Method android/support/v7/widget/p."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #8                  // class android/support/design/widget/CheckableImageButton$1
      11: dup
      12: aload_0
      13: invokespecial #36                 // Method android/support/design/widget/CheckableImageButton$1."<init>":(Landroid/support/design/widget/CheckableImageButton;)V
      16: invokestatic  #41                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/b;)V
      19: return

  public boolean isChecked();
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Z
       4: ireturn

  public int[] onCreateDrawableState(int);
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Z
       4: ifeq          24
       7: aload_0
       8: iload_1
       9: getstatic     #17                 // Field a:[I
      12: arraylength
      13: iadd
      14: invokespecial #49                 // Method android/support/v7/widget/p.onCreateDrawableState:(I)[I
      17: getstatic     #17                 // Field a:[I
      20: invokestatic  #53                 // Method mergeDrawableStates:([I[I)[I
      23: areturn
      24: aload_0
      25: iload_1
      26: invokespecial #49                 // Method android/support/v7/widget/p.onCreateDrawableState:(I)[I
      29: areturn

  public void setChecked(boolean);
    Code:
       0: aload_0
       1: getfield      #45                 // Field b:Z
       4: iload_1
       5: if_icmpeq     24
       8: aload_0
       9: iload_1
      10: putfield      #45                 // Field b:Z
      13: aload_0
      14: invokevirtual #58                 // Method refreshDrawableState:()V
      17: aload_0
      18: sipush        2048
      21: invokevirtual #62                 // Method sendAccessibilityEvent:(I)V
      24: return

  public void toggle();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #45                 // Field b:Z
       5: iconst_1
       6: ixor
       7: invokevirtual #65                 // Method setChecked:(Z)V
      10: return
}
