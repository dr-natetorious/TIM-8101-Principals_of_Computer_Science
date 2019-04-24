public class android.support.v4.app.y extends android.support.v4.app.i {
  android.widget.ListAdapter a;

  android.widget.ListView b;

  android.view.View c;

  android.widget.TextView d;

  android.view.View e;

  android.view.View f;

  java.lang.CharSequence g;

  boolean h;

  public android.support.v4.app.y();
    Code:
       0: aload_0
       1: invokespecial #32                 // Method android/support/v4/app/i."<init>":()V
       4: aload_0
       5: new           #34                 // class android/os/Handler
       8: dup
       9: invokespecial #35                 // Method android/os/Handler."<init>":()V
      12: putfield      #37                 // Field i:Landroid/os/Handler;
      15: aload_0
      16: new           #6                  // class android/support/v4/app/y$1
      19: dup
      20: aload_0
      21: invokespecial #40                 // Method android/support/v4/app/y$1."<init>":(Landroid/support/v4/app/y;)V
      24: putfield      #42                 // Field j:Ljava/lang/Runnable;
      27: aload_0
      28: new           #8                  // class android/support/v4/app/y$2
      31: dup
      32: aload_0
      33: invokespecial #43                 // Method android/support/v4/app/y$2."<init>":(Landroid/support/v4/app/y;)V
      36: putfield      #45                 // Field k:Landroid/widget/AdapterView$OnItemClickListener;
      39: return

  public android.widget.ListView a();
    Code:
       0: aload_0
       1: invokespecial #49                 // Method c:()V
       4: aload_0
       5: getfield      #89                 // Field b:Landroid/widget/ListView;
       8: areturn

  public void a(android.widget.ListAdapter);
    Code:
       0: aload_0
       1: getfield      #136                // Field a:Landroid/widget/ListAdapter;
       4: astore        4
       6: iconst_0
       7: istore_3
       8: aload         4
      10: ifnull        18
      13: iconst_1
      14: istore_2
      15: goto          20
      18: iconst_0
      19: istore_2
      20: aload_0
      21: aload_1
      22: putfield      #136                // Field a:Landroid/widget/ListAdapter;
      25: aload_0
      26: getfield      #89                 // Field b:Landroid/widget/ListView;
      29: ifnull        69
      32: aload_0
      33: getfield      #89                 // Field b:Landroid/widget/ListView;
      36: aload_1
      37: invokevirtual #149                // Method android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
      40: aload_0
      41: getfield      #60                 // Field h:Z
      44: ifne          69
      47: iload_2
      48: ifne          69
      51: aload_0
      52: invokevirtual #93                 // Method getView:()Landroid/view/View;
      55: invokevirtual #153                // Method android/view/View.getWindowToken:()Landroid/os/IBinder;
      58: ifnull        63
      61: iconst_1
      62: istore_3
      63: aload_0
      64: iconst_1
      65: iload_3
      66: invokespecial #141                // Method a:(ZZ)V
      69: return

  public void a(android.widget.ListView, android.view.View, int, long);
    Code:
       0: return

  public android.widget.ListAdapter b();
    Code:
       0: aload_0
       1: getfield      #136                // Field a:Landroid/widget/ListAdapter;
       4: areturn

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_0
       1: invokevirtual #64                 // Method getContext:()Landroid/content/Context;
       4: astore_2
       5: new           #159                // class android/widget/FrameLayout
       8: dup
       9: aload_2
      10: invokespecial #162                // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;)V
      13: astore_1
      14: new           #164                // class android/widget/LinearLayout
      17: dup
      18: aload_2
      19: invokespecial #165                // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;)V
      22: astore_3
      23: aload_3
      24: ldc           #111                // int 16711682
      26: invokevirtual #168                // Method android/widget/LinearLayout.setId:(I)V
      29: aload_3
      30: iconst_1
      31: invokevirtual #171                // Method android/widget/LinearLayout.setOrientation:(I)V
      34: aload_3
      35: bipush        8
      37: invokevirtual #172                // Method android/widget/LinearLayout.setVisibility:(I)V
      40: aload_3
      41: bipush        17
      43: invokevirtual #175                // Method android/widget/LinearLayout.setGravity:(I)V
      46: aload_3
      47: new           #177                // class android/widget/ProgressBar
      50: dup
      51: aload_2
      52: aconst_null
      53: ldc           #178                // int 16842874
      55: invokespecial #181                // Method android/widget/ProgressBar."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
      58: new           #183                // class android/widget/FrameLayout$LayoutParams
      61: dup
      62: bipush        -2
      64: bipush        -2
      66: invokespecial #186                // Method android/widget/FrameLayout$LayoutParams."<init>":(II)V
      69: invokevirtual #190                // Method android/widget/LinearLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
      72: aload_1
      73: aload_3
      74: new           #183                // class android/widget/FrameLayout$LayoutParams
      77: dup
      78: iconst_m1
      79: iconst_m1
      80: invokespecial #186                // Method android/widget/FrameLayout$LayoutParams."<init>":(II)V
      83: invokevirtual #191                // Method android/widget/FrameLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
      86: new           #159                // class android/widget/FrameLayout
      89: dup
      90: aload_2
      91: invokespecial #162                // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;)V
      94: astore_3
      95: aload_3
      96: ldc           #112                // int 16711683
      98: invokevirtual #192                // Method android/widget/FrameLayout.setId:(I)V
     101: new           #104                // class android/widget/TextView
     104: dup
     105: aload_2
     106: invokespecial #193                // Method android/widget/TextView."<init>":(Landroid/content/Context;)V
     109: astore        4
     111: aload         4
     113: ldc           #98                 // int 16711681
     115: invokevirtual #194                // Method android/widget/TextView.setId:(I)V
     118: aload         4
     120: bipush        17
     122: invokevirtual #195                // Method android/widget/TextView.setGravity:(I)V
     125: aload_3
     126: aload         4
     128: new           #183                // class android/widget/FrameLayout$LayoutParams
     131: dup
     132: iconst_m1
     133: iconst_m1
     134: invokespecial #186                // Method android/widget/FrameLayout$LayoutParams."<init>":(II)V
     137: invokevirtual #191                // Method android/widget/FrameLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
     140: new           #97                 // class android/widget/ListView
     143: dup
     144: aload_2
     145: invokespecial #196                // Method android/widget/ListView."<init>":(Landroid/content/Context;)V
     148: astore_2
     149: aload_2
     150: ldc           #113                // int 16908298
     152: invokevirtual #197                // Method android/widget/ListView.setId:(I)V
     155: aload_2
     156: iconst_0
     157: invokevirtual #201                // Method android/widget/ListView.setDrawSelectorOnTop:(Z)V
     160: aload_3
     161: aload_2
     162: new           #183                // class android/widget/FrameLayout$LayoutParams
     165: dup
     166: iconst_m1
     167: iconst_m1
     168: invokespecial #186                // Method android/widget/FrameLayout$LayoutParams."<init>":(II)V
     171: invokevirtual #191                // Method android/widget/FrameLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
     174: aload_1
     175: aload_3
     176: new           #183                // class android/widget/FrameLayout$LayoutParams
     179: dup
     180: iconst_m1
     181: iconst_m1
     182: invokespecial #186                // Method android/widget/FrameLayout$LayoutParams."<init>":(II)V
     185: invokevirtual #191                // Method android/widget/FrameLayout.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
     188: aload_1
     189: new           #183                // class android/widget/FrameLayout$LayoutParams
     192: dup
     193: iconst_m1
     194: iconst_m1
     195: invokespecial #186                // Method android/widget/FrameLayout$LayoutParams."<init>":(II)V
     198: invokevirtual #205                // Method android/widget/FrameLayout.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     201: aload_1
     202: areturn

  public void onDestroyView();
    Code:
       0: aload_0
       1: getfield      #37                 // Field i:Landroid/os/Handler;
       4: aload_0
       5: getfield      #42                 // Field j:Ljava/lang/Runnable;
       8: invokevirtual #210                // Method android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
      11: aload_0
      12: aconst_null
      13: putfield      #89                 // Field b:Landroid/widget/ListView;
      16: aload_0
      17: iconst_0
      18: putfield      #60                 // Field h:Z
      21: aload_0
      22: aconst_null
      23: putfield      #79                 // Field f:Landroid/view/View;
      26: aload_0
      27: aconst_null
      28: putfield      #51                 // Field e:Landroid/view/View;
      31: aload_0
      32: aconst_null
      33: putfield      #109                // Field c:Landroid/view/View;
      36: aload_0
      37: aconst_null
      38: putfield      #106                // Field d:Landroid/widget/TextView;
      41: aload_0
      42: invokespecial #212                // Method android/support/v4/app/i.onDestroyView:()V
      45: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #216                // Method android/support/v4/app/i.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
       6: aload_0
       7: invokespecial #49                 // Method c:()V
      10: return
}
