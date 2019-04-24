public class android.support.design.internal.SnackbarContentLayout extends android.widget.LinearLayout implements android.support.design.widget.b$c {
  public android.support.design.internal.SnackbarContentLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #18                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.internal.SnackbarContentLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #20                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_1
       7: aload_2
       8: getstatic     #26                 // Field android/support/design/a$j.SnackbarLayout:[I
      11: invokevirtual #32                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      14: astore_1
      15: aload_0
      16: aload_1
      17: getstatic     #35                 // Field android/support/design/a$j.SnackbarLayout_android_maxWidth:I
      20: iconst_m1
      21: invokevirtual #41                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      24: putfield      #43                 // Field c:I
      27: aload_0
      28: aload_1
      29: getstatic     #46                 // Field android/support/design/a$j.SnackbarLayout_maxActionInlineWidth:I
      32: iconst_m1
      33: invokevirtual #41                 // Method android/content/res/TypedArray.getDimensionPixelSize:(II)I
      36: putfield      #48                 // Field d:I
      39: aload_1
      40: invokevirtual #52                 // Method android/content/res/TypedArray.recycle:()V
      43: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/widget/TextView;
       4: fconst_0
       5: invokevirtual #107                // Method android/widget/TextView.setAlpha:(F)V
       8: aload_0
       9: getfield      #92                 // Field a:Landroid/widget/TextView;
      12: invokevirtual #111                // Method android/widget/TextView.animate:()Landroid/view/ViewPropertyAnimator;
      15: fconst_1
      16: invokevirtual #117                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      19: astore        7
      21: iload_2
      22: i2l
      23: lstore_3
      24: aload         7
      26: lload_3
      27: invokevirtual #121                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      30: astore        7
      32: iload_1
      33: i2l
      34: lstore        5
      36: aload         7
      38: lload         5
      40: invokevirtual #124                // Method android/view/ViewPropertyAnimator.setStartDelay:(J)Landroid/view/ViewPropertyAnimator;
      43: invokevirtual #127                // Method android/view/ViewPropertyAnimator.start:()V
      46: aload_0
      47: getfield      #129                // Field b:Landroid/widget/Button;
      50: invokevirtual #134                // Method android/widget/Button.getVisibility:()I
      53: ifne          87
      56: aload_0
      57: getfield      #129                // Field b:Landroid/widget/Button;
      60: fconst_0
      61: invokevirtual #135                // Method android/widget/Button.setAlpha:(F)V
      64: aload_0
      65: getfield      #129                // Field b:Landroid/widget/Button;
      68: invokevirtual #136                // Method android/widget/Button.animate:()Landroid/view/ViewPropertyAnimator;
      71: fconst_1
      72: invokevirtual #117                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      75: lload_3
      76: invokevirtual #121                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      79: lload         5
      81: invokevirtual #124                // Method android/view/ViewPropertyAnimator.setStartDelay:(J)Landroid/view/ViewPropertyAnimator;
      84: invokevirtual #127                // Method android/view/ViewPropertyAnimator.start:()V
      87: return

  public void b(int, int);
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/widget/TextView;
       4: fconst_1
       5: invokevirtual #107                // Method android/widget/TextView.setAlpha:(F)V
       8: aload_0
       9: getfield      #92                 // Field a:Landroid/widget/TextView;
      12: invokevirtual #111                // Method android/widget/TextView.animate:()Landroid/view/ViewPropertyAnimator;
      15: fconst_0
      16: invokevirtual #117                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      19: astore        7
      21: iload_2
      22: i2l
      23: lstore_3
      24: aload         7
      26: lload_3
      27: invokevirtual #121                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      30: astore        7
      32: iload_1
      33: i2l
      34: lstore        5
      36: aload         7
      38: lload         5
      40: invokevirtual #124                // Method android/view/ViewPropertyAnimator.setStartDelay:(J)Landroid/view/ViewPropertyAnimator;
      43: invokevirtual #127                // Method android/view/ViewPropertyAnimator.start:()V
      46: aload_0
      47: getfield      #129                // Field b:Landroid/widget/Button;
      50: invokevirtual #134                // Method android/widget/Button.getVisibility:()I
      53: ifne          87
      56: aload_0
      57: getfield      #129                // Field b:Landroid/widget/Button;
      60: fconst_1
      61: invokevirtual #135                // Method android/widget/Button.setAlpha:(F)V
      64: aload_0
      65: getfield      #129                // Field b:Landroid/widget/Button;
      68: invokevirtual #136                // Method android/widget/Button.animate:()Landroid/view/ViewPropertyAnimator;
      71: fconst_0
      72: invokevirtual #117                // Method android/view/ViewPropertyAnimator.alpha:(F)Landroid/view/ViewPropertyAnimator;
      75: lload_3
      76: invokevirtual #121                // Method android/view/ViewPropertyAnimator.setDuration:(J)Landroid/view/ViewPropertyAnimator;
      79: lload         5
      81: invokevirtual #124                // Method android/view/ViewPropertyAnimator.setStartDelay:(J)Landroid/view/ViewPropertyAnimator;
      84: invokevirtual #127                // Method android/view/ViewPropertyAnimator.start:()V
      87: return

  public android.widget.Button getActionView();
    Code:
       0: aload_0
       1: getfield      #129                // Field b:Landroid/widget/Button;
       4: areturn

  public android.widget.TextView getMessageView();
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/widget/TextView;
       4: areturn

  protected void onFinishInflate();
    Code:
       0: aload_0
       1: invokespecial #143                // Method android/widget/LinearLayout.onFinishInflate:()V
       4: aload_0
       5: aload_0
       6: getstatic     #148                // Field android/support/design/a$f.snackbar_text:I
       9: invokevirtual #152                // Method findViewById:(I)Landroid/view/View;
      12: checkcast     #94                 // class android/widget/TextView
      15: putfield      #92                 // Field a:Landroid/widget/TextView;
      18: aload_0
      19: aload_0
      20: getstatic     #155                // Field android/support/design/a$f.snackbar_action:I
      23: invokevirtual #152                // Method findViewById:(I)Landroid/view/View;
      26: checkcast     #131                // class android/widget/Button
      29: putfield      #129                // Field b:Landroid/widget/Button;
      32: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: invokespecial #158                // Method android/widget/LinearLayout.onMeasure:(II)V
       6: iload_1
       7: istore_3
       8: aload_0
       9: getfield      #43                 // Field c:I
      12: ifle          44
      15: iload_1
      16: istore_3
      17: aload_0
      18: invokevirtual #161                // Method getMeasuredWidth:()I
      21: aload_0
      22: getfield      #43                 // Field c:I
      25: if_icmple     44
      28: aload_0
      29: getfield      #43                 // Field c:I
      32: ldc           #162                // int 1073741824
      34: invokestatic  #167                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      37: istore_3
      38: aload_0
      39: iload_3
      40: iload_2
      41: invokespecial #158                // Method android/widget/LinearLayout.onMeasure:(II)V
      44: aload_0
      45: invokevirtual #171                // Method getResources:()Landroid/content/res/Resources;
      48: getstatic     #176                // Field android/support/design/a$d.design_snackbar_padding_vertical_2lines:I
      51: invokevirtual #181                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      54: istore        5
      56: aload_0
      57: invokevirtual #171                // Method getResources:()Landroid/content/res/Resources;
      60: getstatic     #184                // Field android/support/design/a$d.design_snackbar_padding_vertical:I
      63: invokevirtual #181                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      66: istore        6
      68: aload_0
      69: getfield      #92                 // Field a:Landroid/widget/TextView;
      72: invokevirtual #188                // Method android/widget/TextView.getLayout:()Landroid/text/Layout;
      75: invokevirtual #193                // Method android/text/Layout.getLineCount:()I
      78: istore_1
      79: iconst_1
      80: istore        4
      82: iload_1
      83: iconst_1
      84: if_icmple     92
      87: iconst_1
      88: istore_1
      89: goto          94
      92: iconst_0
      93: istore_1
      94: iload_1
      95: ifeq          140
      98: aload_0
      99: getfield      #48                 // Field d:I
     102: ifle          140
     105: aload_0
     106: getfield      #129                // Field b:Landroid/widget/Button;
     109: invokevirtual #194                // Method android/widget/Button.getMeasuredWidth:()I
     112: aload_0
     113: getfield      #48                 // Field d:I
     116: if_icmple     140
     119: aload_0
     120: iconst_1
     121: iload         5
     123: iload         5
     125: iload         6
     127: isub
     128: invokespecial #196                // Method a:(III)Z
     131: ifeq          169
     134: iload         4
     136: istore_1
     137: goto          171
     140: iload_1
     141: ifeq          150
     144: iload         5
     146: istore_1
     147: goto          153
     150: iload         6
     152: istore_1
     153: aload_0
     154: iconst_0
     155: iload_1
     156: iload_1
     157: invokespecial #196                // Method a:(III)Z
     160: ifeq          169
     163: iload         4
     165: istore_1
     166: goto          171
     169: iconst_0
     170: istore_1
     171: iload_1
     172: ifeq          181
     175: aload_0
     176: iload_3
     177: iload_2
     178: invokespecial #158                // Method android/widget/LinearLayout.onMeasure:(II)V
     181: return
}
