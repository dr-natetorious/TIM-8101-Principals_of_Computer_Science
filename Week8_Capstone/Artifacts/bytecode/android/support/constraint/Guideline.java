public class android.support.constraint.Guideline extends android.view.View {
  public android.support.constraint.Guideline(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #8                  // Method android/view/View."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: bipush        8
       8: invokespecial #12                 // Method android/view/View.setVisibility:(I)V
      11: return

  public android.support.constraint.Guideline(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #16                 // Method android/view/View."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: aload_0
       7: bipush        8
       9: invokespecial #12                 // Method android/view/View.setVisibility:(I)V
      12: return

  public android.support.constraint.Guideline(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #19                 // Method android/view/View."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: bipush        8
      10: invokespecial #12                 // Method android/view/View.setVisibility:(I)V
      13: return

  public android.support.constraint.Guideline(android.content.Context, android.util.AttributeSet, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #19                 // Method android/view/View."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: bipush        8
      10: invokespecial #12                 // Method android/view/View.setVisibility:(I)V
      13: return

  public void draw(android.graphics.Canvas);
    Code:
       0: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: iconst_0
       2: iconst_0
       3: invokevirtual #27                 // Method setMeasuredDimension:(II)V
       6: return

  public void setGuidelineBegin(int);
    Code:
       0: aload_0
       1: invokevirtual #32                 // Method getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #34                 // class android/support/constraint/ConstraintLayout$a
       7: astore_2
       8: aload_2
       9: iload_1
      10: putfield      #38                 // Field android/support/constraint/ConstraintLayout$a.a:I
      13: aload_0
      14: aload_2
      15: invokevirtual #42                 // Method setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
      18: return

  public void setGuidelineEnd(int);
    Code:
       0: aload_0
       1: invokevirtual #32                 // Method getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #34                 // class android/support/constraint/ConstraintLayout$a
       7: astore_2
       8: aload_2
       9: iload_1
      10: putfield      #46                 // Field android/support/constraint/ConstraintLayout$a.b:I
      13: aload_0
      14: aload_2
      15: invokevirtual #42                 // Method setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
      18: return

  public void setGuidelinePercent(float);
    Code:
       0: aload_0
       1: invokevirtual #32                 // Method getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #34                 // class android/support/constraint/ConstraintLayout$a
       7: astore_2
       8: aload_2
       9: fload_1
      10: putfield      #52                 // Field android/support/constraint/ConstraintLayout$a.c:F
      13: aload_0
      14: aload_2
      15: invokevirtual #42                 // Method setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
      18: return

  public void setVisibility(int);
    Code:
       0: return
}
