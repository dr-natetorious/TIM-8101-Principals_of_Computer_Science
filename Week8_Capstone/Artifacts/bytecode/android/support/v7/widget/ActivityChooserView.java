public class android.support.v7.widget.ActivityChooserView extends android.view.ViewGroup {
  final android.support.v7.widget.ActivityChooserView$a a;

  final android.widget.FrameLayout b;

  final android.widget.FrameLayout c;

  android.support.v4.view.c d;

  final android.database.DataSetObserver e;

  android.widget.PopupWindow$OnDismissListener f;

  boolean g;

  int h;

  void a(int);
    Code:
       0: new           #42                 // class java/lang/RuntimeException
       3: dup
       4: ldc           #44                 // String d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       6: invokespecial #50                 // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
       9: athrow

  public boolean a();
    Code:
       0: aload_0
       1: invokevirtual #54                 // Method c:()Z
       4: ifne          31
       7: aload_0
       8: getfield      #56                 // Field o:Z
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: iconst_0
      18: putfield      #58                 // Field g:Z
      21: aload_0
      22: aload_0
      23: getfield      #60                 // Field h:I
      26: invokevirtual #62                 // Method a:(I)V
      29: iconst_1
      30: ireturn
      31: iconst_0
      32: ireturn

  public boolean b();
    Code:
       0: aload_0
       1: invokevirtual #54                 // Method c:()Z
       4: ifeq          34
       7: aload_0
       8: invokevirtual #66                 // Method getListPopupWindow:()Landroid/support/v7/widget/aw;
      11: invokevirtual #71                 // Method android/support/v7/widget/aw.e:()V
      14: aload_0
      15: invokevirtual #75                 // Method getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      18: astore_1
      19: aload_1
      20: invokevirtual #80                 // Method android/view/ViewTreeObserver.isAlive:()Z
      23: ifeq          34
      26: aload_1
      27: aload_0
      28: getfield      #82                 // Field m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      31: invokevirtual #86                 // Method android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      34: iconst_1
      35: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: invokevirtual #66                 // Method getListPopupWindow:()Landroid/support/v7/widget/aw;
       4: invokevirtual #88                 // Method android/support/v7/widget/aw.f:()Z
       7: ireturn

  public android.support.v7.widget.e getDataModel();
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/support/v7/widget/ActivityChooserView$a;
       4: invokevirtual #94                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
       7: areturn

  android.support.v7.widget.aw getListPopupWindow();
    Code:
       0: aload_0
       1: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
       4: ifnonnull     71
       7: aload_0
       8: new           #68                 // class android/support/v7/widget/aw
      11: dup
      12: aload_0
      13: invokevirtual #100                // Method getContext:()Landroid/content/Context;
      16: invokespecial #103                // Method android/support/v7/widget/aw."<init>":(Landroid/content/Context;)V
      19: putfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      22: aload_0
      23: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      26: aload_0
      27: getfield      #92                 // Field a:Landroid/support/v7/widget/ActivityChooserView$a;
      30: invokevirtual #106                // Method android/support/v7/widget/aw.a:(Landroid/widget/ListAdapter;)V
      33: aload_0
      34: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      37: aload_0
      38: invokevirtual #109                // Method android/support/v7/widget/aw.b:(Landroid/view/View;)V
      41: aload_0
      42: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      45: iconst_1
      46: invokevirtual #112                // Method android/support/v7/widget/aw.a:(Z)V
      49: aload_0
      50: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      53: aload_0
      54: getfield      #114                // Field i:Landroid/support/v7/widget/ActivityChooserView$b;
      57: invokevirtual #117                // Method android/support/v7/widget/aw.a:(Landroid/widget/AdapterView$OnItemClickListener;)V
      60: aload_0
      61: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      64: aload_0
      65: getfield      #114                // Field i:Landroid/support/v7/widget/ActivityChooserView$b;
      68: invokevirtual #120                // Method android/support/v7/widget/aw.a:(Landroid/widget/PopupWindow$OnDismissListener;)V
      71: aload_0
      72: getfield      #96                 // Field n:Landroid/support/v7/widget/aw;
      75: areturn

  protected void onAttachedToWindow();
    Code:
       0: aload_0
       1: invokespecial #123                // Method android/view/ViewGroup.onAttachedToWindow:()V
       4: aload_0
       5: getfield      #92                 // Field a:Landroid/support/v7/widget/ActivityChooserView$a;
       8: invokevirtual #94                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
      11: astore_1
      12: aload_1
      13: ifnull        24
      16: aload_1
      17: aload_0
      18: getfield      #125                // Field e:Landroid/database/DataSetObserver;
      21: invokevirtual #131                // Method android/support/v7/widget/e.registerObserver:(Ljava/lang/Object;)V
      24: aload_0
      25: iconst_1
      26: putfield      #56                 // Field o:Z
      29: return

  protected void onDetachedFromWindow();
    Code:
       0: aload_0
       1: invokespecial #134                // Method android/view/ViewGroup.onDetachedFromWindow:()V
       4: aload_0
       5: getfield      #92                 // Field a:Landroid/support/v7/widget/ActivityChooserView$a;
       8: invokevirtual #94                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
      11: astore_1
      12: aload_1
      13: ifnull        24
      16: aload_1
      17: aload_0
      18: getfield      #125                // Field e:Landroid/database/DataSetObserver;
      21: invokevirtual #137                // Method android/support/v7/widget/e.unregisterObserver:(Ljava/lang/Object;)V
      24: aload_0
      25: invokevirtual #75                 // Method getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      28: astore_1
      29: aload_1
      30: invokevirtual #80                 // Method android/view/ViewTreeObserver.isAlive:()Z
      33: ifeq          44
      36: aload_1
      37: aload_0
      38: getfield      #82                 // Field m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      41: invokevirtual #86                 // Method android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      44: aload_0
      45: invokevirtual #54                 // Method c:()Z
      48: ifeq          56
      51: aload_0
      52: invokevirtual #139                // Method b:()Z
      55: pop
      56: aload_0
      57: iconst_0
      58: putfield      #56                 // Field o:Z
      61: return

  protected void onLayout(boolean, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #143                // Field j:Landroid/view/View;
       4: iconst_0
       5: iconst_0
       6: iload         4
       8: iload_2
       9: isub
      10: iload         5
      12: iload_3
      13: isub
      14: invokevirtual #149                // Method android/view/View.layout:(IIII)V
      17: aload_0
      18: invokevirtual #54                 // Method c:()Z
      21: ifne          29
      24: aload_0
      25: invokevirtual #139                // Method b:()Z
      28: pop
      29: return

  protected void onMeasure(int, int);
    Code:
       0: aload_0
       1: getfield      #143                // Field j:Landroid/view/View;
       4: astore        4
       6: iload_2
       7: istore_3
       8: aload_0
       9: getfield      #153                // Field c:Landroid/widget/FrameLayout;
      12: invokevirtual #159                // Method android/widget/FrameLayout.getVisibility:()I
      15: ifeq          28
      18: iload_2
      19: invokestatic  #165                // Method android/view/View$MeasureSpec.getSize:(I)I
      22: ldc           #166                // int 1073741824
      24: invokestatic  #170                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      27: istore_3
      28: aload_0
      29: aload         4
      31: iload_1
      32: iload_3
      33: invokevirtual #174                // Method measureChild:(Landroid/view/View;II)V
      36: aload_0
      37: aload         4
      39: invokevirtual #177                // Method android/view/View.getMeasuredWidth:()I
      42: aload         4
      44: invokevirtual #180                // Method android/view/View.getMeasuredHeight:()I
      47: invokevirtual #183                // Method setMeasuredDimension:(II)V
      50: return

  public void setActivityChooserModel(android.support.v7.widget.e);
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/support/v7/widget/ActivityChooserView$a;
       4: aload_1
       5: invokevirtual #187                // Method android/support/v7/widget/ActivityChooserView$a.a:(Landroid/support/v7/widget/e;)V
       8: aload_0
       9: invokevirtual #54                 // Method c:()Z
      12: ifeq          25
      15: aload_0
      16: invokevirtual #139                // Method b:()Z
      19: pop
      20: aload_0
      21: invokevirtual #189                // Method a:()Z
      24: pop
      25: return

  public void setDefaultActionButtonContentDescription(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #192                // Field p:I
       5: return

  public void setExpandActivityOverflowButtonContentDescription(int);
    Code:
       0: aload_0
       1: invokevirtual #100                // Method getContext:()Landroid/content/Context;
       4: iload_1
       5: invokevirtual #199                // Method android/content/Context.getString:(I)Ljava/lang/String;
       8: astore_2
       9: aload_0
      10: getfield      #201                // Field k:Landroid/widget/ImageView;
      13: aload_2
      14: invokevirtual #207                // Method android/widget/ImageView.setContentDescription:(Ljava/lang/CharSequence;)V
      17: return

  public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #201                // Field k:Landroid/widget/ImageView;
       4: aload_1
       5: invokevirtual #212                // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
       8: return

  public void setInitialActivityCount(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #60                 // Field h:I
       5: return

  public void setOnDismissListener(android.widget.PopupWindow$OnDismissListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #216                // Field f:Landroid/widget/PopupWindow$OnDismissListener;
       5: return

  public void setProvider(android.support.v4.view.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #220                // Field d:Landroid/support/v4/view/c;
       5: return
}
