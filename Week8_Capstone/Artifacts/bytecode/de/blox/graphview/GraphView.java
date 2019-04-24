public class de.blox.graphview.GraphView extends com.c.a.g {
  public de.blox.graphview.GraphView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #11                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public de.blox.graphview.GraphView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #15                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public de.blox.graphview.GraphView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #16                 // Method com/c/a/g."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #18                 // class de/blox/graphview/g
      11: dup
      12: aload_1
      13: aload_2
      14: iload_3
      15: invokespecial #19                 // Method de/blox/graphview/g."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      18: putfield      #21                 // Field c:Lde/blox/graphview/g;
      21: aload_0
      22: aload_0
      23: getfield      #21                 // Field c:Lde/blox/graphview/g;
      26: iconst_m1
      27: new           #23                 // class android/view/ViewGroup$LayoutParams
      30: dup
      31: bipush        -2
      33: bipush        -2
      35: invokespecial #26                 // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
      38: invokespecial #30                 // Method com/c/a/g.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      41: aload_0
      42: iconst_1
      43: invokevirtual #34                 // Method setHasClickableChildren:(Z)V
      46: return

  public void addView(android.view.View, int, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: instanceof    #18                 // class de/blox/graphview/g
       4: ifne          17
       7: new           #36                 // class java/lang/RuntimeException
      10: dup
      11: ldc           #38                 // String GraphView can have only GraphContainer as a child
      13: invokespecial #41                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: aload_1
      19: iload_2
      20: aload_3
      21: invokespecial #30                 // Method com/c/a/g.addView:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      24: return

  public de.blox.graphview.f getAdapter();
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: invokevirtual #45                 // Method de/blox/graphview/g.c:()Lde/blox/graphview/f;
       7: areturn

  public int getLineColor();
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: invokevirtual #50                 // Method de/blox/graphview/g.b:()I
       7: ireturn

  public int getLineThickness();
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: invokevirtual #54                 // Method de/blox/graphview/g.a:()I
       7: ireturn

  public void setAdapter(de.blox.graphview.f);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: aload_1
       5: invokevirtual #58                 // Method de/blox/graphview/g.a:(Lde/blox/graphview/f;)V
       8: return

  public void setLineColor(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: iload_1
       5: invokevirtual #62                 // Method de/blox/graphview/g.b:(I)V
       8: return

  public void setLineThickness(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: iload_1
       5: invokevirtual #65                 // Method de/blox/graphview/g.a:(I)V
       8: return

  public void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: aload_1
       5: invokevirtual #69                 // Method de/blox/graphview/g.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
       8: return

  public void setUseMaxSize(boolean);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:Lde/blox/graphview/g;
       4: iload_1
       5: invokevirtual #72                 // Method de/blox/graphview/g.a:(Z)V
       8: return
}
