public class android.support.v7.widget.SearchView extends android.support.v7.widget.av implements android.support.v7.view.c {
  static final android.support.v7.widget.SearchView$a i;

  final android.support.v7.widget.SearchView$SearchAutoComplete a;

  final android.widget.ImageView b;

  final android.widget.ImageView c;

  final android.widget.ImageView d;

  final android.widget.ImageView e;

  android.view.View$OnFocusChangeListener f;

  android.support.v4.widget.d g;

  android.app.SearchableInfo h;

  static {};
    Code:
       0: new           #13                 // class android/support/v7/widget/SearchView$a
       3: dup
       4: invokespecial #94                 // Method android/support/v7/widget/SearchView$a."<init>":()V
       7: putstatic     #96                 // Field i:Landroid/support/v7/widget/SearchView$a;
      10: return

  static boolean a(android.content.Context);
    Code:
       0: aload_0
       1: invokevirtual #227                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       4: invokevirtual #233                // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
       7: getfield      #238                // Field android/content/res/Configuration.orientation:I
      10: iconst_2
      11: if_icmpne     16
      14: iconst_1
      15: ireturn
      16: iconst_0
      17: ireturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #337                // Field K:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: iconst_1
      10: putfield      #337                // Field K:Z
      13: aload_0
      14: aload_0
      15: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      18: invokevirtual #428                // Method android/support/v7/widget/SearchView$SearchAutoComplete.getImeOptions:()I
      21: putfield      #430                // Field L:I
      24: aload_0
      25: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      28: aload_0
      29: getfield      #430                // Field L:I
      32: ldc_w         #431                // int 33554432
      35: ior
      36: invokevirtual #378                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setImeOptions:(I)V
      39: aload_0
      40: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      43: ldc_w         #361                // String
      46: invokevirtual #419                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setText:(Ljava/lang/CharSequence;)V
      49: aload_0
      50: iconst_0
      51: invokevirtual #434                // Method setIconified:(Z)V
      54: return

  void a(int, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: ldc_w         #437                // String android.intent.action.SEARCH
       4: aconst_null
       5: aconst_null
       6: aload_3
       7: iload_1
       8: aload_2
       9: invokespecial #439                // Method a:(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
      12: astore_2
      13: aload_0
      14: invokevirtual #293                // Method getContext:()Landroid/content/Context;
      17: aload_2
      18: invokevirtual #443                // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      21: return

  void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #445                // Method setQuery:(Ljava/lang/CharSequence;)V
       5: return

  public void a(java.lang.CharSequence, boolean);
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: aload_1
       5: invokevirtual #419                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setText:(Ljava/lang/CharSequence;)V
       8: aload_1
       9: ifnull        31
      12: aload_0
      13: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      16: aload_0
      17: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      20: invokevirtual #447                // Method android/support/v7/widget/SearchView$SearchAutoComplete.length:()I
      23: invokevirtual #427                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setSelection:(I)V
      26: aload_0
      27: aload_1
      28: putfield      #116                // Field J:Ljava/lang/CharSequence;
      31: iload_2
      32: ifeq          46
      35: aload_1
      36: invokestatic  #193                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      39: ifne          46
      42: aload_0
      43: invokevirtual #449                // Method d:()V
      46: return

  public void b();
    Code:
       0: aload_0
       1: ldc_w         #361                // String
       4: iconst_0
       5: invokevirtual #451                // Method a:(Ljava/lang/CharSequence;Z)V
       8: aload_0
       9: invokevirtual #454                // Method clearFocus:()V
      12: aload_0
      13: iconst_1
      14: invokespecial #456                // Method a:(Z)V
      17: aload_0
      18: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      21: aload_0
      22: getfield      #430                // Field L:I
      25: invokevirtual #378                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setImeOptions:(I)V
      28: aload_0
      29: iconst_0
      30: putfield      #337                // Field K:Z
      33: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #181                // Field C:Z
       4: ireturn

  public void clearFocus();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #458                // Field G:Z
       5: aload_0
       6: invokespecial #459                // Method android/support/v7/widget/av.clearFocus:()V
       9: aload_0
      10: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      13: invokevirtual #460                // Method android/support/v7/widget/SearchView$SearchAutoComplete.clearFocus:()V
      16: aload_0
      17: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      20: iconst_0
      21: invokestatic  #463                // Method android/support/v7/widget/SearchView$SearchAutoComplete.a:(Landroid/support/v7/widget/SearchView$SearchAutoComplete;Z)V
      24: aload_0
      25: iconst_0
      26: putfield      #458                // Field G:Z
      29: return

  void d();
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: invokevirtual #187                // Method android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
       7: astore_1
       8: aload_1
       9: ifnull        75
      12: aload_1
      13: invokestatic  #467                // Method android/text/TextUtils.getTrimmedLength:(Ljava/lang/CharSequence;)I
      16: ifle          75
      19: aload_0
      20: getfield      #469                // Field x:Landroid/support/v7/widget/SearchView$c;
      23: ifnull        44
      26: aload_0
      27: getfield      #469                // Field x:Landroid/support/v7/widget/SearchView$c;
      30: aload_1
      31: invokeinterface #472,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      36: invokeinterface #475,  2          // InterfaceMethod android/support/v7/widget/SearchView$c.a:(Ljava/lang/String;)Z
      41: ifne          75
      44: aload_0
      45: getfield      #143                // Field h:Landroid/app/SearchableInfo;
      48: ifnull        63
      51: aload_0
      52: iconst_0
      53: aconst_null
      54: aload_1
      55: invokeinterface #472,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      60: invokevirtual #477                // Method a:(ILjava/lang/String;Ljava/lang/String;)V
      63: aload_0
      64: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      67: iconst_0
      68: invokestatic  #463                // Method android/support/v7/widget/SearchView$SearchAutoComplete.a:(Landroid/support/v7/widget/SearchView$SearchAutoComplete;Z)V
      71: aload_0
      72: invokespecial #479                // Method q:()V
      75: return

  void e();
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: invokevirtual #187                // Method android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
       7: invokestatic  #193                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      10: ifeq          49
      13: aload_0
      14: getfield      #214                // Field B:Z
      17: ifeq          75
      20: aload_0
      21: getfield      #481                // Field y:Landroid/support/v7/widget/SearchView$b;
      24: ifnull        39
      27: aload_0
      28: getfield      #481                // Field y:Landroid/support/v7/widget/SearchView$b;
      31: invokeinterface #483,  1          // InterfaceMethod android/support/v7/widget/SearchView$b.a:()Z
      36: ifne          75
      39: aload_0
      40: invokevirtual #454                // Method clearFocus:()V
      43: aload_0
      44: iconst_1
      45: invokespecial #456                // Method a:(Z)V
      48: return
      49: aload_0
      50: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      53: ldc_w         #361                // String
      56: invokevirtual #419                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setText:(Ljava/lang/CharSequence;)V
      59: aload_0
      60: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      63: invokevirtual #486                // Method android/support/v7/widget/SearchView$SearchAutoComplete.requestFocus:()Z
      66: pop
      67: aload_0
      68: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      71: iconst_1
      72: invokestatic  #463                // Method android/support/v7/widget/SearchView$SearchAutoComplete.a:(Landroid/support/v7/widget/SearchView$SearchAutoComplete;Z)V
      75: return

  void f();
    Code:
       0: aload_0
       1: iconst_0
       2: invokespecial #456                // Method a:(Z)V
       5: aload_0
       6: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       9: invokevirtual #486                // Method android/support/v7/widget/SearchView$SearchAutoComplete.requestFocus:()Z
      12: pop
      13: aload_0
      14: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      17: iconst_1
      18: invokestatic  #463                // Method android/support/v7/widget/SearchView$SearchAutoComplete.a:(Landroid/support/v7/widget/SearchView$SearchAutoComplete;Z)V
      21: aload_0
      22: getfield      #488                // Field A:Landroid/view/View$OnClickListener;
      25: ifnull        38
      28: aload_0
      29: getfield      #488                // Field A:Landroid/view/View$OnClickListener;
      32: aload_0
      33: invokeinterface #494,  2          // InterfaceMethod android/view/View$OnClickListener.onClick:(Landroid/view/View;)V
      38: return

  void g();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #286                // Method c:()Z
       5: invokespecial #456                // Method a:(Z)V
       8: aload_0
       9: invokespecial #496                // Method n:()V
      12: aload_0
      13: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      16: invokevirtual #497                // Method android/support/v7/widget/SearchView$SearchAutoComplete.hasFocus:()Z
      19: ifeq          26
      22: aload_0
      23: invokevirtual #499                // Method h:()V
      26: return

  public int getImeOptions();
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: invokevirtual #428                // Method android/support/v7/widget/SearchView$SearchAutoComplete.getImeOptions:()I
       7: ireturn

  public int getInputType();
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: invokevirtual #500                // Method android/support/v7/widget/SearchView$SearchAutoComplete.getInputType:()I
       7: ireturn

  public int getMaxWidth();
    Code:
       0: aload_0
       1: getfield      #503                // Field H:I
       4: ireturn

  public java.lang.CharSequence getQuery();
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: invokevirtual #187                // Method android/support/v7/widget/SearchView$SearchAutoComplete.getText:()Landroid/text/Editable;
       7: areturn

  public java.lang.CharSequence getQueryHint();
    Code:
       0: aload_0
       1: getfield      #506                // Field E:Ljava/lang/CharSequence;
       4: ifnull        12
       7: aload_0
       8: getfield      #506                // Field E:Ljava/lang/CharSequence;
      11: areturn
      12: aload_0
      13: getfield      #143                // Field h:Landroid/app/SearchableInfo;
      16: ifnull        44
      19: aload_0
      20: getfield      #143                // Field h:Landroid/app/SearchableInfo;
      23: invokevirtual #509                // Method android/app/SearchableInfo.getHintId:()I
      26: ifeq          44
      29: aload_0
      30: invokevirtual #293                // Method getContext:()Landroid/content/Context;
      33: aload_0
      34: getfield      #143                // Field h:Landroid/app/SearchableInfo;
      37: invokevirtual #509                // Method android/app/SearchableInfo.getHintId:()I
      40: invokevirtual #512                // Method android/content/Context.getText:(I)Ljava/lang/CharSequence;
      43: areturn
      44: aload_0
      45: getfield      #514                // Field w:Ljava/lang/CharSequence;
      48: areturn

  int getSuggestionCommitIconResId();
    Code:
       0: aload_0
       1: getfield      #517                // Field t:I
       4: ireturn

  int getSuggestionRowLayout();
    Code:
       0: aload_0
       1: getfield      #520                // Field s:I
       4: ireturn

  public android.support.v4.widget.d getSuggestionsAdapter();
    Code:
       0: aload_0
       1: getfield      #392                // Field g:Landroid/support/v4/widget/d;
       4: areturn

  void h();
    Code:
       0: getstatic     #96                 // Field i:Landroid/support/v7/widget/SearchView$a;
       3: aload_0
       4: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       7: invokevirtual #525                // Method android/support/v7/widget/SearchView$a.a:(Landroid/widget/AutoCompleteTextView;)V
      10: getstatic     #96                 // Field i:Landroid/support/v7/widget/SearchView$a;
      13: aload_0
      14: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      17: invokevirtual #527                // Method android/support/v7/widget/SearchView$a.b:(Landroid/widget/AutoCompleteTextView;)V
      20: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #351                // Field N:Ljava/lang/Runnable;
       5: invokevirtual #531                // Method removeCallbacks:(Ljava/lang/Runnable;)Z
       8: pop
       9: aload_0
      10: aload_0
      11: getfield      #533                // Field O:Ljava/lang/Runnable;
      14: invokevirtual #355                // Method post:(Ljava/lang/Runnable;)Z
      17: pop
      18: aload_0
      19: invokespecial #535                // Method android/support/v7/widget/av.onDetachedFromWindow:()V
      22: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: iload_1
       2: iload_2
       3: iload_3
       4: iload         4
       6: iload         5
       8: invokespecial #539                // Method android/support/v7/widget/av.onLayout:(ZIIII)V
      11: iload_1
      12: ifeq          107
      15: aload_0
      16: aload_0
      17: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      20: aload_0
      21: getfield      #541                // Field m:Landroid/graphics/Rect;
      24: invokespecial #543                // Method a:(Landroid/view/View;Landroid/graphics/Rect;)V
      27: aload_0
      28: getfield      #545                // Field n:Landroid/graphics/Rect;
      31: aload_0
      32: getfield      #541                // Field m:Landroid/graphics/Rect;
      35: getfield      #548                // Field android/graphics/Rect.left:I
      38: iconst_0
      39: aload_0
      40: getfield      #541                // Field m:Landroid/graphics/Rect;
      43: getfield      #551                // Field android/graphics/Rect.right:I
      46: iload         5
      48: iload_3
      49: isub
      50: invokevirtual #178                // Method android/graphics/Rect.set:(IIII)V
      53: aload_0
      54: getfield      #553                // Field l:Landroid/support/v7/widget/SearchView$f;
      57: ifnonnull     92
      60: aload_0
      61: new           #30                 // class android/support/v7/widget/SearchView$f
      64: dup
      65: aload_0
      66: getfield      #545                // Field n:Landroid/graphics/Rect;
      69: aload_0
      70: getfield      #541                // Field m:Landroid/graphics/Rect;
      73: aload_0
      74: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      77: invokespecial #556                // Method android/support/v7/widget/SearchView$f."<init>":(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V
      80: putfield      #553                // Field l:Landroid/support/v7/widget/SearchView$f;
      83: aload_0
      84: aload_0
      85: getfield      #553                // Field l:Landroid/support/v7/widget/SearchView$f;
      88: invokevirtual #560                // Method setTouchDelegate:(Landroid/view/TouchDelegate;)V
      91: return
      92: aload_0
      93: getfield      #553                // Field l:Landroid/support/v7/widget/SearchView$f;
      96: aload_0
      97: getfield      #545                // Field n:Landroid/graphics/Rect;
     100: aload_0
     101: getfield      #541                // Field m:Landroid/graphics/Rect;
     104: invokevirtual #563                // Method android/support/v7/widget/SearchView$f.a:(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
     107: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: invokevirtual #286                // Method c:()Z
       4: ifeq          14
       7: aload_0
       8: iload_1
       9: iload_2
      10: invokespecial #567                // Method android/support/v7/widget/av.onMeasure:(II)V
      13: return
      14: iload_1
      15: invokestatic  #572                // Method android/view/View$MeasureSpec.getMode:(I)I
      18: istore        4
      20: iload_1
      21: invokestatic  #575                // Method android/view/View$MeasureSpec.getSize:(I)I
      24: istore_3
      25: iload         4
      27: ldc_w         #576                // int -2147483648
      30: if_icmpeq     86
      33: iload         4
      35: ifeq          63
      38: iload         4
      40: ldc_w         #577                // int 1073741824
      43: if_icmpeq     51
      46: iload_3
      47: istore_1
      48: goto          115
      51: iload_3
      52: istore_1
      53: aload_0
      54: getfield      #503                // Field H:I
      57: ifle          115
      60: goto          93
      63: aload_0
      64: getfield      #503                // Field H:I
      67: ifle          78
      70: aload_0
      71: getfield      #503                // Field H:I
      74: istore_1
      75: goto          115
      78: aload_0
      79: invokespecial #579                // Method getPreferredWidth:()I
      82: istore_1
      83: goto          115
      86: aload_0
      87: getfield      #503                // Field H:I
      90: ifle          107
      93: aload_0
      94: getfield      #503                // Field H:I
      97: istore_1
      98: iload_1
      99: iload_3
     100: invokestatic  #585                // Method java/lang/Math.min:(II)I
     103: istore_1
     104: goto          115
     107: aload_0
     108: invokespecial #579                // Method getPreferredWidth:()I
     111: istore_1
     112: goto          98
     115: iload_2
     116: invokestatic  #572                // Method android/view/View$MeasureSpec.getMode:(I)I
     119: istore_3
     120: iload_2
     121: invokestatic  #575                // Method android/view/View$MeasureSpec.getSize:(I)I
     124: istore_2
     125: iload_3
     126: ldc_w         #576                // int -2147483648
     129: if_icmpeq     147
     132: iload_3
     133: ifeq          139
     136: goto          156
     139: aload_0
     140: invokespecial #587                // Method getPreferredHeight:()I
     143: istore_2
     144: goto          156
     147: aload_0
     148: invokespecial #587                // Method getPreferredHeight:()I
     151: iload_2
     152: invokestatic  #585                // Method java/lang/Math.min:(II)I
     155: istore_2
     156: aload_0
     157: iload_1
     158: ldc_w         #577                // int 1073741824
     161: invokestatic  #590                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     164: iload_2
     165: ldc_w         #577                // int 1073741824
     168: invokestatic  #590                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
     171: invokespecial #567                // Method android/support/v7/widget/av.onMeasure:(II)V
     174: return

  protected void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #25                 // class android/support/v7/widget/SearchView$e
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #594                // Method android/support/v7/widget/av.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      12: return
      13: aload_1
      14: checkcast     #25                 // class android/support/v7/widget/SearchView$e
      17: astore_1
      18: aload_0
      19: aload_1
      20: invokevirtual #597                // Method android/support/v7/widget/SearchView$e.a:()Landroid/os/Parcelable;
      23: invokespecial #594                // Method android/support/v7/widget/av.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      26: aload_0
      27: aload_1
      28: getfield      #599                // Field android/support/v7/widget/SearchView$e.a:Z
      31: invokespecial #456                // Method a:(Z)V
      34: aload_0
      35: invokevirtual #602                // Method requestLayout:()V
      38: return

  protected android.os.Parcelable onSaveInstanceState();
    Code:
       0: new           #25                 // class android/support/v7/widget/SearchView$e
       3: dup
       4: aload_0
       5: invokespecial #605                // Method android/support/v7/widget/av.onSaveInstanceState:()Landroid/os/Parcelable;
       8: invokespecial #607                // Method android/support/v7/widget/SearchView$e."<init>":(Landroid/os/Parcelable;)V
      11: astore_1
      12: aload_1
      13: aload_0
      14: invokevirtual #286                // Method c:()Z
      17: putfield      #599                // Field android/support/v7/widget/SearchView$e.a:Z
      20: aload_1
      21: areturn

  public void onWindowFocusChanged(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #610                // Method android/support/v7/widget/av.onWindowFocusChanged:(Z)V
       5: aload_0
       6: invokespecial #496                // Method n:()V
       9: return

  public boolean requestFocus(int, android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #458                // Field G:Z
       4: ifeq          9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: invokevirtual #614                // Method isFocusable:()Z
      13: ifne          18
      16: iconst_0
      17: ireturn
      18: aload_0
      19: invokevirtual #286                // Method c:()Z
      22: ifne          46
      25: aload_0
      26: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      29: iload_1
      30: aload_2
      31: invokevirtual #616                // Method android/support/v7/widget/SearchView$SearchAutoComplete.requestFocus:(ILandroid/graphics/Rect;)Z
      34: istore_3
      35: iload_3
      36: ifeq          44
      39: aload_0
      40: iconst_0
      41: invokespecial #456                // Method a:(Z)V
      44: iload_3
      45: ireturn
      46: aload_0
      47: iload_1
      48: aload_2
      49: invokespecial #617                // Method android/support/v7/widget/av.requestFocus:(ILandroid/graphics/Rect;)Z
      52: ireturn

  public void setAppSearchData(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #129                // Field M:Landroid/os/Bundle;
       5: return

  public void setIconified(boolean);
    Code:
       0: iload_1
       1: ifeq          9
       4: aload_0
       5: invokevirtual #621                // Method e:()V
       8: return
       9: aload_0
      10: invokevirtual #623                // Method f:()V
      13: return

  public void setIconifiedByDefault(boolean);
    Code:
       0: aload_0
       1: getfield      #214                // Field B:Z
       4: iload_1
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #214                // Field B:Z
      14: aload_0
      15: iload_1
      16: invokespecial #456                // Method a:(Z)V
      19: aload_0
      20: invokespecial #626                // Method o:()V
      23: return

  public void setImeOptions(int);
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: iload_1
       5: invokevirtual #378                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setImeOptions:(I)V
       8: return

  public void setInputType(int);
    Code:
       0: aload_0
       1: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       4: iload_1
       5: invokevirtual #390                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setInputType:(I)V
       8: return

  public void setMaxWidth(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #503                // Field H:I
       5: aload_0
       6: invokevirtual #602                // Method requestLayout:()V
       9: return

  public void setOnCloseListener(android.support.v7.widget.SearchView$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #481                // Field y:Landroid/support/v7/widget/SearchView$b;
       5: return

  public void setOnQueryTextFocusChangeListener(android.view.View$OnFocusChangeListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #633                // Field f:Landroid/view/View$OnFocusChangeListener;
       5: return

  public void setOnQueryTextListener(android.support.v7.widget.SearchView$c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #469                // Field x:Landroid/support/v7/widget/SearchView$c;
       5: return

  public void setOnSearchClickListener(android.view.View$OnClickListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #488                // Field A:Landroid/view/View$OnClickListener;
       5: return

  public void setOnSuggestionListener(android.support.v7.widget.SearchView$d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #641                // Field z:Landroid/support/v7/widget/SearchView$d;
       5: return

  public void setQueryHint(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #506                // Field E:Ljava/lang/CharSequence;
       5: aload_0
       6: invokespecial #626                // Method o:()V
       9: return

  public void setQueryRefinementEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #410                // Field F:Z
       5: aload_0
       6: getfield      #392                // Field g:Landroid/support/v4/widget/d;
       9: instanceof    #399                // class android/support/v7/widget/bj
      12: ifeq          39
      15: aload_0
      16: getfield      #392                // Field g:Landroid/support/v4/widget/d;
      19: checkcast     #399                // class android/support/v7/widget/bj
      22: astore_3
      23: iload_1
      24: ifeq          32
      27: iconst_2
      28: istore_2
      29: goto          34
      32: iconst_1
      33: istore_2
      34: aload_3
      35: iload_2
      36: invokevirtual #412                // Method android/support/v7/widget/bj.a:(I)V
      39: return

  public void setSearchableInfo(android.app.SearchableInfo);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #143                // Field h:Landroid/app/SearchableInfo;
       5: aload_0
       6: getfield      #143                // Field h:Landroid/app/SearchableInfo;
       9: ifnull        20
      12: aload_0
      13: invokespecial #647                // Method p:()V
      16: aload_0
      17: invokespecial #626                // Method o:()V
      20: aload_0
      21: aload_0
      22: invokespecial #649                // Method i:()Z
      25: putfield      #282                // Field I:Z
      28: aload_0
      29: getfield      #282                // Field I:Z
      32: ifeq          45
      35: aload_0
      36: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
      39: ldc_w         #651                // String nm
      42: invokevirtual #654                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setPrivateImeOptions:(Ljava/lang/String;)V
      45: aload_0
      46: aload_0
      47: invokevirtual #286                // Method c:()Z
      50: invokespecial #456                // Method a:(Z)V
      53: return

  public void setSubmitButtonEnabled(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #274                // Field D:Z
       5: aload_0
       6: aload_0
       7: invokevirtual #286                // Method c:()Z
      10: invokespecial #456                // Method a:(Z)V
      13: return

  public void setSuggestionsAdapter(android.support.v4.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #392                // Field g:Landroid/support/v4/widget/d;
       5: aload_0
       6: getfield      #183                // Field a:Landroid/support/v7/widget/SearchView$SearchAutoComplete;
       9: aload_0
      10: getfield      #392                // Field g:Landroid/support/v4/widget/d;
      13: invokevirtual #408                // Method android/support/v7/widget/SearchView$SearchAutoComplete.setAdapter:(Landroid/widget/ListAdapter;)V
      16: return
}
