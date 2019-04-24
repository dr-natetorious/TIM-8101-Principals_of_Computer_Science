public class android.support.v7.widget.SearchView$SearchAutoComplete extends android.support.v7.widget.g {
  final java.lang.Runnable a;

  public android.support.v7.widget.SearchView$SearchAutoComplete(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #22                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.v7.widget.SearchView$SearchAutoComplete(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: getstatic     #28                 // Field android/support/v7/a/a$a.autoCompleteTextViewStyle:I
       6: invokespecial #31                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       9: return

  public android.support.v7.widget.SearchView$SearchAutoComplete(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #32                 // Method android/support/v7/widget/g."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #9                  // class android/support/v7/widget/SearchView$SearchAutoComplete$1
      11: dup
      12: aload_0
      13: invokespecial #35                 // Method android/support/v7/widget/SearchView$SearchAutoComplete$1."<init>":(Landroid/support/v7/widget/SearchView$SearchAutoComplete;)V
      16: putfield      #37                 // Field a:Ljava/lang/Runnable;
      19: aload_0
      20: aload_0
      21: invokevirtual #41                 // Method getThreshold:()I
      24: putfield      #43                 // Field b:I
      27: return

  static void a(android.support.v7.widget.SearchView$SearchAutoComplete);
    Code:
       0: aload_0
       1: invokespecial #66                 // Method a:()V
       4: return

  static void a(android.support.v7.widget.SearchView$SearchAutoComplete, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #71                 // Method setImeVisibility:(Z)V
       5: return

  public boolean enoughToFilter();
    Code:
       0: aload_0
       1: getfield      #43                 // Field b:I
       4: ifle          19
       7: aload_0
       8: invokespecial #113                // Method android/support/v7/widget/g.enoughToFilter:()Z
      11: ifeq          17
      14: goto          19
      17: iconst_0
      18: ireturn
      19: iconst_1
      20: ireturn

  public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #117                // Method android/support/v7/widget/g.onCreateInputConnection:(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
       5: astore_1
       6: aload_0
       7: getfield      #46                 // Field d:Z
      10: ifeq          31
      13: aload_0
      14: aload_0
      15: getfield      #37                 // Field a:Ljava/lang/Runnable;
      18: invokevirtual #97                 // Method removeCallbacks:(Ljava/lang/Runnable;)Z
      21: pop
      22: aload_0
      23: aload_0
      24: getfield      #37                 // Field a:Ljava/lang/Runnable;
      27: invokevirtual #120                // Method post:(Ljava/lang/Runnable;)Z
      30: pop
      31: aload_1
      32: areturn

  protected void onFinishInflate();
    Code:
       0: aload_0
       1: invokespecial #123                // Method android/support/v7/widget/g.onFinishInflate:()V
       4: aload_0
       5: invokevirtual #76                 // Method getResources:()Landroid/content/res/Resources;
       8: invokevirtual #127                // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      11: astore_1
      12: aload_0
      13: iconst_1
      14: aload_0
      15: invokespecial #129                // Method getSearchViewTextMinWidthDp:()I
      18: i2f
      19: aload_1
      20: invokestatic  #135                // Method android/util/TypedValue.applyDimension:(IFLandroid/util/DisplayMetrics;)F
      23: f2i
      24: invokevirtual #139                // Method setMinWidth:(I)V
      27: return

  protected void onFocusChanged(boolean, int, android.graphics.Rect);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: aload_3
       4: invokespecial #143                // Method android/support/v7/widget/g.onFocusChanged:(ZILandroid/graphics/Rect;)V
       7: aload_0
       8: getfield      #145                // Field c:Landroid/support/v7/widget/SearchView;
      11: invokevirtual #148                // Method android/support/v7/widget/SearchView.g:()V
      14: return

  public boolean onKeyPreIme(int, android.view.KeyEvent);
    Code:
       0: iload_1
       1: iconst_4
       2: if_icmpne     86
       5: aload_2
       6: invokevirtual #155                // Method android/view/KeyEvent.getAction:()I
       9: ifne          36
      12: aload_2
      13: invokevirtual #158                // Method android/view/KeyEvent.getRepeatCount:()I
      16: ifne          36
      19: aload_0
      20: invokevirtual #162                // Method getKeyDispatcherState:()Landroid/view/KeyEvent$DispatcherState;
      23: astore_3
      24: aload_3
      25: ifnull        34
      28: aload_3
      29: aload_2
      30: aload_0
      31: invokevirtual #168                // Method android/view/KeyEvent$DispatcherState.startTracking:(Landroid/view/KeyEvent;Ljava/lang/Object;)V
      34: iconst_1
      35: ireturn
      36: aload_2
      37: invokevirtual #155                // Method android/view/KeyEvent.getAction:()I
      40: iconst_1
      41: if_icmpne     86
      44: aload_0
      45: invokevirtual #162                // Method getKeyDispatcherState:()Landroid/view/KeyEvent$DispatcherState;
      48: astore_3
      49: aload_3
      50: ifnull        58
      53: aload_3
      54: aload_2
      55: invokevirtual #172                // Method android/view/KeyEvent$DispatcherState.handleUpEvent:(Landroid/view/KeyEvent;)V
      58: aload_2
      59: invokevirtual #175                // Method android/view/KeyEvent.isTracking:()Z
      62: ifeq          86
      65: aload_2
      66: invokevirtual #178                // Method android/view/KeyEvent.isCanceled:()Z
      69: ifne          86
      72: aload_0
      73: getfield      #145                // Field c:Landroid/support/v7/widget/SearchView;
      76: invokevirtual #181                // Method android/support/v7/widget/SearchView.clearFocus:()V
      79: aload_0
      80: iconst_0
      81: invokespecial #71                 // Method setImeVisibility:(Z)V
      84: iconst_1
      85: ireturn
      86: aload_0
      87: iload_1
      88: aload_2
      89: invokespecial #183                // Method android/support/v7/widget/g.onKeyPreIme:(ILandroid/view/KeyEvent;)Z
      92: ireturn

  public void onWindowFocusChanged(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #186                // Method android/support/v7/widget/g.onWindowFocusChanged:(Z)V
       5: iload_1
       6: ifeq          49
       9: aload_0
      10: getfield      #145                // Field c:Landroid/support/v7/widget/SearchView;
      13: invokevirtual #189                // Method android/support/v7/widget/SearchView.hasFocus:()Z
      16: ifeq          49
      19: aload_0
      20: invokevirtual #192                // Method getVisibility:()I
      23: ifne          49
      26: aload_0
      27: iconst_1
      28: putfield      #46                 // Field d:Z
      31: aload_0
      32: invokevirtual #50                 // Method getContext:()Landroid/content/Context;
      35: invokestatic  #195                // Method android/support/v7/widget/SearchView.a:(Landroid/content/Context;)Z
      38: ifeq          49
      41: getstatic     #199                // Field android/support/v7/widget/SearchView.i:Landroid/support/v7/widget/SearchView$a;
      44: aload_0
      45: iconst_1
      46: invokevirtual #204                // Method android/support/v7/widget/SearchView$a.a:(Landroid/widget/AutoCompleteTextView;Z)V
      49: return

  public void performCompletion();
    Code:
       0: return

  protected void replaceText(java.lang.CharSequence);
    Code:
       0: return

  void setSearchView(android.support.v7.widget.SearchView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #145                // Field c:Landroid/support/v7/widget/SearchView;
       5: return

  public void setThreshold(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #212                // Method android/support/v7/widget/g.setThreshold:(I)V
       5: aload_0
       6: iload_1
       7: putfield      #43                 // Field b:I
      10: return
}
