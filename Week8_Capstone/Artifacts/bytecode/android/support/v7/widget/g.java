public class android.support.v7.widget.g extends android.widget.AutoCompleteTextView implements android.support.v4.view.r {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #15                 // int 16843126
       7: iastore
       8: putstatic     #17                 // Field a:[I
      11: return

  public android.support.v7.widget.g(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #23                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.g(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #29                 // Field android/support/v7/a/a$a.autoCompleteTextViewStyle:I
       6: invokespecial #32                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.v7.widget.g(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #37                 // Method android/support/v7/widget/bm.a:(Landroid/content/Context;)Landroid/content/Context;
       5: aload_2
       6: iload_3
       7: invokespecial #38                 // Method android/widget/AutoCompleteTextView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      10: aload_0
      11: invokevirtual #42                 // Method getContext:()Landroid/content/Context;
      14: aload_2
      15: getstatic     #17                 // Field a:[I
      18: iload_3
      19: iconst_0
      20: invokestatic  #47                 // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      23: astore_1
      24: aload_1
      25: iconst_0
      26: invokevirtual #51                 // Method android/support/v7/widget/bp.g:(I)Z
      29: ifeq          41
      32: aload_0
      33: aload_1
      34: iconst_0
      35: invokevirtual #54                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      38: invokevirtual #58                 // Method setDropDownBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
      41: aload_1
      42: invokevirtual #60                 // Method android/support/v7/widget/bp.a:()V
      45: aload_0
      46: new           #62                 // class android/support/v7/widget/h
      49: dup
      50: aload_0
      51: invokespecial #65                 // Method android/support/v7/widget/h."<init>":(Landroid/view/View;)V
      54: putfield      #67                 // Field b:Landroid/support/v7/widget/h;
      57: aload_0
      58: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      61: aload_2
      62: iload_3
      63: invokevirtual #70                 // Method android/support/v7/widget/h.a:(Landroid/util/AttributeSet;I)V
      66: aload_0
      67: aload_0
      68: invokestatic  #75                 // Method android/support/v7/widget/aa.a:(Landroid/widget/TextView;)Landroid/support/v7/widget/aa;
      71: putfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      74: aload_0
      75: getfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      78: aload_2
      79: iload_3
      80: invokevirtual #78                 // Method android/support/v7/widget/aa.a:(Landroid/util/AttributeSet;I)V
      83: aload_0
      84: getfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      87: invokevirtual #79                 // Method android/support/v7/widget/aa.a:()V
      90: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #82                 // Method android/widget/AutoCompleteTextView.drawableStateChanged:()V
       4: aload_0
       5: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       8: ifnull        18
      11: aload_0
      12: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      15: invokevirtual #84                 // Method android/support/v7/widget/h.c:()V
      18: aload_0
      19: getfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      22: ifnull        32
      25: aload_0
      26: getfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      29: invokevirtual #79                 // Method android/support/v7/widget/aa.a:()V
      32: return

  public android.content.res.ColorStateList getSupportBackgroundTintList();
    Code:
       0: aload_0
       1: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      11: invokevirtual #88                 // Method android/support/v7/widget/h.a:()Landroid/content/res/ColorStateList;
      14: areturn
      15: aconst_null
      16: areturn

  public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode();
    Code:
       0: aload_0
       1: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      11: invokevirtual #92                 // Method android/support/v7/widget/h.b:()Landroid/graphics/PorterDuff$Mode;
      14: areturn
      15: aconst_null
      16: areturn

  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #96                 // Method android/widget/AutoCompleteTextView.onCreateInputConnection:(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
       5: aload_1
       6: aload_0
       7: invokestatic  #101                // Method android/support/v7/widget/o.a:(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;
      10: areturn

  public void setBackgroundDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #104                // Method android/widget/AutoCompleteTextView.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
       5: aload_0
       6: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       9: ifnull        20
      12: aload_0
      13: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      16: aload_1
      17: invokevirtual #106                // Method android/support/v7/widget/h.a:(Landroid/graphics/drawable/Drawable;)V
      20: return

  public void setBackgroundResource(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #110                // Method android/widget/AutoCompleteTextView.setBackgroundResource:(I)V
       5: aload_0
       6: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       9: ifnull        20
      12: aload_0
      13: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      16: iload_1
      17: invokevirtual #112                // Method android/support/v7/widget/h.a:(I)V
      20: return

  public void setDropDownBackgroundResource(int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #42                 // Method getContext:()Landroid/content/Context;
       5: iload_1
       6: invokestatic  #118                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
       9: invokevirtual #58                 // Method setDropDownBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setSupportBackgroundTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      11: aload_1
      12: invokevirtual #122                // Method android/support/v7/widget/h.a:(Landroid/content/res/ColorStateList;)V
      15: return

  public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #67                 // Field b:Landroid/support/v7/widget/h;
      11: aload_1
      12: invokevirtual #126                // Method android/support/v7/widget/h.a:(Landroid/graphics/PorterDuff$Mode;)V
      15: return

  public void setTextAppearance(android.content.Context, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #130                // Method android/widget/AutoCompleteTextView.setTextAppearance:(Landroid/content/Context;I)V
       6: aload_0
       7: getfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      10: ifnull        22
      13: aload_0
      14: getfield      #77                 // Field c:Landroid/support/v7/widget/aa;
      17: aload_1
      18: iload_2
      19: invokevirtual #132                // Method android/support/v7/widget/aa.a:(Landroid/content/Context;I)V
      22: return
}
