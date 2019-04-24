public class android.support.v7.widget.ac extends android.widget.TextView implements android.support.v4.view.r,android.support.v4.widget.b {
  public android.support.v7.widget.ac(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #17                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.ac(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: ldc           #19                 // int 16842884
       5: invokespecial #22                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       8: return

  public android.support.v7.widget.ac(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #28                 // Method android/support/v7/widget/bm.a:(Landroid/content/Context;)Landroid/content/Context;
       5: aload_2
       6: iload_3
       7: invokespecial #29                 // Method android/widget/TextView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      10: aload_0
      11: new           #31                 // class android/support/v7/widget/h
      14: dup
      15: aload_0
      16: invokespecial #34                 // Method android/support/v7/widget/h."<init>":(Landroid/view/View;)V
      19: putfield      #36                 // Field b:Landroid/support/v7/widget/h;
      22: aload_0
      23: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      26: aload_2
      27: iload_3
      28: invokevirtual #39                 // Method android/support/v7/widget/h.a:(Landroid/util/AttributeSet;I)V
      31: aload_0
      32: aload_0
      33: invokestatic  #44                 // Method android/support/v7/widget/aa.a:(Landroid/widget/TextView;)Landroid/support/v7/widget/aa;
      36: putfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      39: aload_0
      40: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      43: aload_2
      44: iload_3
      45: invokevirtual #47                 // Method android/support/v7/widget/aa.a:(Landroid/util/AttributeSet;I)V
      48: aload_0
      49: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      52: invokevirtual #50                 // Method android/support/v7/widget/aa.a:()V
      55: return

  protected void drawableStateChanged();
    Code:
       0: aload_0
       1: invokespecial #53                 // Method android/widget/TextView.drawableStateChanged:()V
       4: aload_0
       5: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       8: ifnull        18
      11: aload_0
      12: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      15: invokevirtual #55                 // Method android/support/v7/widget/h.c:()V
      18: aload_0
      19: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      22: ifnull        32
      25: aload_0
      26: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      29: invokevirtual #50                 // Method android/support/v7/widget/aa.a:()V
      32: return

  public int getAutoSizeMaxTextSize();
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          11
       6: aload_0
       7: invokespecial #62                 // Method android/widget/TextView.getAutoSizeMaxTextSize:()I
      10: ireturn
      11: aload_0
      12: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      15: ifnull        26
      18: aload_0
      19: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      22: invokevirtual #65                 // Method android/support/v7/widget/aa.g:()I
      25: ireturn
      26: iconst_m1
      27: ireturn

  public int getAutoSizeMinTextSize();
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          11
       6: aload_0
       7: invokespecial #68                 // Method android/widget/TextView.getAutoSizeMinTextSize:()I
      10: ireturn
      11: aload_0
      12: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      15: ifnull        26
      18: aload_0
      19: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      22: invokevirtual #71                 // Method android/support/v7/widget/aa.f:()I
      25: ireturn
      26: iconst_m1
      27: ireturn

  public int getAutoSizeStepGranularity();
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          11
       6: aload_0
       7: invokespecial #74                 // Method android/widget/TextView.getAutoSizeStepGranularity:()I
      10: ireturn
      11: aload_0
      12: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      15: ifnull        26
      18: aload_0
      19: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      22: invokevirtual #77                 // Method android/support/v7/widget/aa.e:()I
      25: ireturn
      26: iconst_m1
      27: ireturn

  public int[] getAutoSizeTextAvailableSizes();
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          11
       6: aload_0
       7: invokespecial #81                 // Method android/widget/TextView.getAutoSizeTextAvailableSizes:()[I
      10: areturn
      11: aload_0
      12: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      15: ifnull        26
      18: aload_0
      19: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      22: invokevirtual #84                 // Method android/support/v7/widget/aa.h:()[I
      25: areturn
      26: iconst_0
      27: newarray       int
      29: areturn

  public int getAutoSizeTextType();
    Code:
       0: getstatic     #60                 // Field a:Z
       3: istore_2
       4: iconst_0
       5: istore_1
       6: iload_2
       7: ifeq          22
      10: aload_0
      11: invokespecial #87                 // Method android/widget/TextView.getAutoSizeTextType:()I
      14: iconst_1
      15: if_icmpne     20
      18: iconst_1
      19: istore_1
      20: iload_1
      21: ireturn
      22: aload_0
      23: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      26: ifnull        37
      29: aload_0
      30: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      33: invokevirtual #90                 // Method android/support/v7/widget/aa.d:()I
      36: ireturn
      37: iconst_0
      38: ireturn

  public android.content.res.ColorStateList getSupportBackgroundTintList();
    Code:
       0: aload_0
       1: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      11: invokevirtual #94                 // Method android/support/v7/widget/h.a:()Landroid/content/res/ColorStateList;
      14: areturn
      15: aconst_null
      16: areturn

  public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode();
    Code:
       0: aload_0
       1: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      11: invokevirtual #98                 // Method android/support/v7/widget/h.b:()Landroid/graphics/PorterDuff$Mode;
      14: areturn
      15: aconst_null
      16: areturn

  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #102                // Method android/widget/TextView.onCreateInputConnection:(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
       5: aload_1
       6: aload_0
       7: invokestatic  #107                // Method android/support/v7/widget/o.a:(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;
      10: areturn

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #111                // Method android/widget/TextView.onLayout:(ZIIII)V
      11: aload_0
      12: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      15: ifnull        32
      18: aload_0
      19: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      22: iload_1
      23: iload_2
      24: iload_3
      25: iload         4
      27: iload         5
      29: invokevirtual #113                // Method android/support/v7/widget/aa.a:(ZIIII)V
      32: return

  protected void onTextChanged(java.lang.CharSequence, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: invokespecial #117                // Method android/widget/TextView.onTextChanged:(Ljava/lang/CharSequence;III)V
       9: aload_0
      10: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      13: ifnull        39
      16: getstatic     #60                 // Field a:Z
      19: ifne          39
      22: aload_0
      23: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      26: invokevirtual #120                // Method android/support/v7/widget/aa.c:()Z
      29: ifeq          39
      32: aload_0
      33: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      36: invokevirtual #122                // Method android/support/v7/widget/aa.b:()V
      39: return

  public void setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int);
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          16
       6: aload_0
       7: iload_1
       8: iload_2
       9: iload_3
      10: iload         4
      12: invokespecial #126                // Method android/widget/TextView.setAutoSizeTextTypeUniformWithConfiguration:(IIII)V
      15: return
      16: aload_0
      17: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      20: ifnull        35
      23: aload_0
      24: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      27: iload_1
      28: iload_2
      29: iload_3
      30: iload         4
      32: invokevirtual #128                // Method android/support/v7/widget/aa.a:(IIII)V
      35: return

  public void setAutoSizeTextTypeUniformWithPresetSizes(int[], int);
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          13
       6: aload_0
       7: aload_1
       8: iload_2
       9: invokespecial #132                // Method android/widget/TextView.setAutoSizeTextTypeUniformWithPresetSizes:([II)V
      12: return
      13: aload_0
      14: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      17: ifnull        29
      20: aload_0
      21: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      24: aload_1
      25: iload_2
      26: invokevirtual #134                // Method android/support/v7/widget/aa.a:([II)V
      29: return

  public void setAutoSizeTextTypeWithDefaults(int);
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          12
       6: aload_0
       7: iload_1
       8: invokespecial #138                // Method android/widget/TextView.setAutoSizeTextTypeWithDefaults:(I)V
      11: return
      12: aload_0
      13: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      16: ifnull        27
      19: aload_0
      20: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      23: iload_1
      24: invokevirtual #140                // Method android/support/v7/widget/aa.a:(I)V
      27: return

  public void setBackgroundDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #144                // Method android/widget/TextView.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
       5: aload_0
       6: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       9: ifnull        20
      12: aload_0
      13: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      16: aload_1
      17: invokevirtual #146                // Method android/support/v7/widget/h.a:(Landroid/graphics/drawable/Drawable;)V
      20: return

  public void setBackgroundResource(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #149                // Method android/widget/TextView.setBackgroundResource:(I)V
       5: aload_0
       6: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       9: ifnull        20
      12: aload_0
      13: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      16: iload_1
      17: invokevirtual #150                // Method android/support/v7/widget/h.a:(I)V
      20: return

  public void setSupportBackgroundTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      11: aload_1
      12: invokevirtual #154                // Method android/support/v7/widget/h.a:(Landroid/content/res/ColorStateList;)V
      15: return

  public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
       4: ifnull        15
       7: aload_0
       8: getfield      #36                 // Field b:Landroid/support/v7/widget/h;
      11: aload_1
      12: invokevirtual #158                // Method android/support/v7/widget/h.a:(Landroid/graphics/PorterDuff$Mode;)V
      15: return

  public void setTextAppearance(android.content.Context, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #162                // Method android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
       6: aload_0
       7: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      10: ifnull        22
      13: aload_0
      14: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      17: aload_1
      18: iload_2
      19: invokevirtual #164                // Method android/support/v7/widget/aa.a:(Landroid/content/Context;I)V
      22: return

  public void setTextSize(int, float);
    Code:
       0: getstatic     #60                 // Field a:Z
       3: ifeq          13
       6: aload_0
       7: iload_1
       8: fload_2
       9: invokespecial #168                // Method android/widget/TextView.setTextSize:(IF)V
      12: return
      13: aload_0
      14: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      17: ifnull        29
      20: aload_0
      21: getfield      #46                 // Field c:Landroid/support/v7/widget/aa;
      24: iload_1
      25: fload_2
      26: invokevirtual #170                // Method android/support/v7/widget/aa.a:(IF)V
      29: return
}
