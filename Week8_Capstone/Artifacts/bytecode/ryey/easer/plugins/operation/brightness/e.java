public class ryey.easer.plugins.operation.brightness.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.brightness.b> {
  public ryey.easer.plugins.operation.brightness.e();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  static android.widget.SeekBar a(ryey.easer.plugins.operation.brightness.e);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/widget/SeekBar;
       4: areturn

  public android.view.ViewGroup a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: new           #22                 // class android/widget/LinearLayout
       3: dup
       4: aload_0
       5: invokevirtual #26                 // Method getContext:()Landroid/content/Context;
       8: invokespecial #29                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;)V
      11: astore_1
      12: aload_1
      13: iconst_1
      14: invokevirtual #33                 // Method android/widget/LinearLayout.setOrientation:(I)V
      17: new           #22                 // class android/widget/LinearLayout
      20: dup
      21: aload_0
      22: invokevirtual #26                 // Method getContext:()Landroid/content/Context;
      25: invokespecial #29                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;)V
      28: astore_2
      29: aload_2
      30: iconst_0
      31: invokevirtual #33                 // Method android/widget/LinearLayout.setOrientation:(I)V
      34: new           #35                 // class android/widget/TextView
      37: dup
      38: aload_0
      39: invokevirtual #26                 // Method getContext:()Landroid/content/Context;
      42: invokespecial #36                 // Method android/widget/TextView."<init>":(Landroid/content/Context;)V
      45: astore_3
      46: aload_3
      47: aload_0
      48: invokevirtual #40                 // Method getResources:()Landroid/content/res/Resources;
      51: ldc           #41                 // int 2131624190
      53: invokevirtual #47                 // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      56: invokevirtual #51                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      59: aload_0
      60: new           #53                 // class android/widget/Switch
      63: dup
      64: aload_0
      65: invokevirtual #26                 // Method getContext:()Landroid/content/Context;
      68: invokespecial #54                 // Method android/widget/Switch."<init>":(Landroid/content/Context;)V
      71: putfield      #56                 // Field a:Landroid/widget/Switch;
      74: aload_0
      75: getfield      #56                 // Field a:Landroid/widget/Switch;
      78: new           #58                 // class android/view/ViewGroup$LayoutParams
      81: dup
      82: bipush        -2
      84: bipush        -2
      86: invokespecial #61                 // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
      89: invokevirtual #65                 // Method android/widget/Switch.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
      92: aload_0
      93: new           #67                 // class android/widget/SeekBar
      96: dup
      97: aload_0
      98: invokevirtual #26                 // Method getContext:()Landroid/content/Context;
     101: invokespecial #68                 // Method android/widget/SeekBar."<init>":(Landroid/content/Context;)V
     104: putfield      #19                 // Field b:Landroid/widget/SeekBar;
     107: aload_0
     108: getfield      #19                 // Field b:Landroid/widget/SeekBar;
     111: new           #58                 // class android/view/ViewGroup$LayoutParams
     114: dup
     115: iconst_m1
     116: bipush        -2
     118: invokespecial #61                 // Method android/view/ViewGroup$LayoutParams."<init>":(II)V
     121: invokevirtual #69                 // Method android/widget/SeekBar.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     124: aload_0
     125: getfield      #19                 // Field b:Landroid/widget/SeekBar;
     128: sipush        255
     131: invokevirtual #72                 // Method android/widget/SeekBar.setMax:(I)V
     134: aload_0
     135: getfield      #19                 // Field b:Landroid/widget/SeekBar;
     138: iconst_0
     139: invokevirtual #76                 // Method android/widget/SeekBar.setEnabled:(Z)V
     142: aload_0
     143: getfield      #56                 // Field a:Landroid/widget/Switch;
     146: new           #7                  // class ryey/easer/plugins/operation/brightness/e$1
     149: dup
     150: aload_0
     151: invokespecial #79                 // Method ryey/easer/plugins/operation/brightness/e$1."<init>":(Lryey/easer/plugins/operation/brightness/e;)V
     154: invokevirtual #83                 // Method android/widget/Switch.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
     157: aload_2
     158: aload_0
     159: getfield      #56                 // Field a:Landroid/widget/Switch;
     162: invokevirtual #87                 // Method android/widget/LinearLayout.addView:(Landroid/view/View;)V
     165: aload_2
     166: aload_3
     167: invokevirtual #87                 // Method android/widget/LinearLayout.addView:(Landroid/view/View;)V
     170: aload_1
     171: aload_2
     172: invokevirtual #87                 // Method android/widget/LinearLayout.addView:(Landroid/view/View;)V
     175: aload_1
     176: aload_0
     177: getfield      #19                 // Field b:Landroid/widget/SeekBar;
     180: invokevirtual #87                 // Method android/widget/LinearLayout.addView:(Landroid/view/View;)V
     183: aload_1
     184: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #91                 // Method b:()Lryey/easer/plugins/operation/brightness/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.brightness.b);
    Code:
       0: aload_1
       1: invokevirtual #98                 // Method ryey/easer/plugins/operation/brightness/b.c:()Z
       4: ifeq          16
       7: aload_0
       8: getfield      #56                 // Field a:Landroid/widget/Switch;
      11: iconst_1
      12: invokevirtual #101                // Method android/widget/Switch.setChecked:(Z)V
      15: return
      16: aload_0
      17: getfield      #56                 // Field a:Landroid/widget/Switch;
      20: iconst_0
      21: invokevirtual #101                // Method android/widget/Switch.setChecked:(Z)V
      24: aload_0
      25: getfield      #19                 // Field b:Landroid/widget/SeekBar;
      28: aload_1
      29: invokevirtual #105                // Method ryey/easer/plugins/operation/brightness/b.d:()Ljava/lang/Integer;
      32: invokevirtual #111                // Method java/lang/Integer.intValue:()I
      35: invokevirtual #114                // Method android/widget/SeekBar.setProgress:(I)V
      38: return

  public ryey.easer.plugins.operation.brightness.b b();
    Code:
       0: aload_0
       1: getfield      #56                 // Field a:Landroid/widget/Switch;
       4: invokevirtual #117                // Method android/widget/Switch.isChecked:()Z
       7: ifeq          19
      10: new           #94                 // class ryey/easer/plugins/operation/brightness/b
      13: dup
      14: iconst_1
      15: invokespecial #119                // Method ryey/easer/plugins/operation/brightness/b."<init>":(Z)V
      18: areturn
      19: new           #94                 // class ryey/easer/plugins/operation/brightness/b
      22: dup
      23: aload_0
      24: getfield      #19                 // Field b:Landroid/widget/SeekBar;
      27: invokevirtual #122                // Method android/widget/SeekBar.getProgress:()I
      30: invokestatic  #126                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      33: invokespecial #129                // Method ryey/easer/plugins/operation/brightness/b."<init>":(Ljava/lang/Integer;)V
      36: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #94                 // class ryey/easer/plugins/operation/brightness/b
       5: invokevirtual #132                // Method a:(Lryey/easer/plugins/operation/brightness/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokevirtual #136                // Method a:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/ViewGroup;
       7: areturn
}
