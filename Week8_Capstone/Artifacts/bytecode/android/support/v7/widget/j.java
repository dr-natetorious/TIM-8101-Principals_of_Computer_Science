public class android.support.v7.widget.j extends android.widget.CheckBox implements android.support.v4.widget.n {
  public android.support.v7.widget.j(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #16                 // Field android/support/v7/a/a$a.checkboxStyle:I
       6: invokespecial #19                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.v7.widget.j(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #25                 // Method android/support/v7/widget/bm.a:(Landroid/content/Context;)Landroid/content/Context;
       5: aload_2
       6: iload_3
       7: invokespecial #26                 // Method android/widget/CheckBox."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      10: aload_0
      11: new           #28                 // class android/support/v7/widget/l
      14: dup
      15: aload_0
      16: invokespecial #31                 // Method android/support/v7/widget/l."<init>":(Landroid/widget/CompoundButton;)V
      19: putfield      #33                 // Field a:Landroid/support/v7/widget/l;
      22: aload_0
      23: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      26: aload_2
      27: iload_3
      28: invokevirtual #36                 // Method android/support/v7/widget/l.a:(Landroid/util/AttributeSet;I)V
      31: return

  public int getCompoundPaddingLeft();
    Code:
       0: aload_0
       1: invokespecial #40                 // Method android/widget/CheckBox.getCompoundPaddingLeft:()I
       4: istore_2
       5: iload_2
       6: istore_1
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      11: ifnull        23
      14: aload_0
      15: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      18: iload_2
      19: invokevirtual #43                 // Method android/support/v7/widget/l.a:(I)I
      22: istore_1
      23: iload_1
      24: ireturn

  public android.content.res.ColorStateList getSupportButtonTintList();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
       4: ifnull        15
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      11: invokevirtual #47                 // Method android/support/v7/widget/l.a:()Landroid/content/res/ColorStateList;
      14: areturn
      15: aconst_null
      16: areturn

  public android.graphics.PorterDuff$Mode getSupportButtonTintMode();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
       4: ifnull        15
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      11: invokevirtual #52                 // Method android/support/v7/widget/l.b:()Landroid/graphics/PorterDuff$Mode;
      14: areturn
      15: aconst_null
      16: areturn

  public void setButtonDrawable(int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #58                 // Method getContext:()Landroid/content/Context;
       5: iload_1
       6: invokestatic  #63                 // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
       9: invokevirtual #66                 // Method setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setButtonDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #67                 // Method android/widget/CheckBox.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
       5: aload_0
       6: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
       9: ifnull        19
      12: aload_0
      13: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      16: invokevirtual #71                 // Method android/support/v7/widget/l.c:()V
      19: return

  public void setSupportButtonTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
       4: ifnull        15
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      11: aload_1
      12: invokevirtual #75                 // Method android/support/v7/widget/l.a:(Landroid/content/res/ColorStateList;)V
      15: return

  public void setSupportButtonTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
       4: ifnull        15
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/l;
      11: aload_1
      12: invokevirtual #79                 // Method android/support/v7/widget/l.a:(Landroid/graphics/PorterDuff$Mode;)V
      15: return
}
