public class ryey.easer.core.ui.b extends android.support.v4.app.i {
  android.view.View a;

  android.widget.TextView b;

  android.widget.ImageView c;

  final android.content.BroadcastReceiver d;

  public ryey.easer.core.ui.b();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method android/support/v4/app/i."<init>":()V
       4: aload_0
       5: new           #6                  // class ryey/easer/core/ui/b$1
       8: dup
       9: aload_0
      10: invokespecial #29                 // Method ryey/easer/core/ui/b$1."<init>":(Lryey/easer/core/ui/b;)V
      13: putfield      #31                 // Field d:Landroid/content/BroadcastReceiver;
      16: return

  static void a(ryey.easer.core.ui.b);
    Code:
       0: aload_0
       1: invokespecial #81                 // Method a:()V
       4: return

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #85                 // Method android/support/v4/app/i.onActivityCreated:(Landroid/os/Bundle;)V
       5: aload_0
       6: iconst_1
       7: invokevirtual #89                 // Method setHasOptionsMenu:(Z)V
      10: return

  public void onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_1
       1: invokeinterface #96,  1           // InterfaceMethod android/view/Menu.clear:()V
       6: aload_2
       7: ldc           #97                 // int 2131492873
       9: aload_1
      10: invokevirtual #103                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      13: aload_0
      14: aload_1
      15: aload_2
      16: invokespecial #105                // Method android/support/v4/app/i.onCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)V
      19: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_0
       1: invokevirtual #111                // Method getActivity:()Landroid/support/v4/app/j;
       4: aload_0
       5: ldc           #112                // int 2131624308
       7: invokevirtual #113                // Method getString:(I)Ljava/lang/String;
      10: invokevirtual #118                // Method android/support/v4/app/j.setTitle:(Ljava/lang/CharSequence;)V
      13: aload_0
      14: aload_1
      15: ldc           #119                // int 2131427390
      17: aload_2
      18: iconst_0
      19: invokevirtual #124                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      22: putfield      #126                // Field a:Landroid/view/View;
      25: aload_0
      26: aload_0
      27: getfield      #126                // Field a:Landroid/view/View;
      30: ldc           #127                // int 2131296586
      32: invokevirtual #133                // Method android/view/View.findViewById:(I)Landroid/view/View;
      35: checkcast     #52                 // class android/widget/TextView
      38: putfield      #39                 // Field b:Landroid/widget/TextView;
      41: aload_0
      42: aload_0
      43: getfield      #126                // Field a:Landroid/view/View;
      46: ldc           #134                // int 2131296587
      48: invokevirtual #133                // Method android/view/View.findViewById:(I)Landroid/view/View;
      51: checkcast     #61                 // class android/widget/ImageView
      54: putfield      #58                 // Field c:Landroid/widget/ImageView;
      57: invokestatic  #139                // Method ryey/easer/core/ui/a.a:()Lryey/easer/core/ui/a;
      60: astore_1
      61: aload_0
      62: invokevirtual #143                // Method getChildFragmentManager:()Landroid/support/v4/app/n;
      65: invokevirtual #148                // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      68: ldc           #149                // int 2131296352
      70: aload_1
      71: invokevirtual #154                // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
      74: invokevirtual #157                // Method android/support/v4/app/u.c:()I
      77: pop
      78: aload_0
      79: getfield      #126                // Field a:Landroid/view/View;
      82: ldc           #158                // int 2131296441
      84: invokevirtual #133                // Method android/view/View.findViewById:(I)Landroid/view/View;
      87: new           #8                  // class ryey/easer/core/ui/b$2
      90: dup
      91: aload_0
      92: invokespecial #159                // Method ryey/easer/core/ui/b$2."<init>":(Lryey/easer/core/ui/b;)V
      95: invokevirtual #163                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      98: aload_0
      99: getfield      #126                // Field a:Landroid/view/View;
     102: ldc           #158                // int 2131296441
     104: invokevirtual #133                // Method android/view/View.findViewById:(I)Landroid/view/View;
     107: new           #10                 // class ryey/easer/core/ui/b$3
     110: dup
     111: aload_0
     112: invokespecial #164                // Method ryey/easer/core/ui/b$3."<init>":(Lryey/easer/core/ui/b;)V
     115: invokevirtual #168                // Method android/view/View.setOnLongClickListener:(Landroid/view/View$OnLongClickListener;)V
     118: aload_0
     119: getfield      #126                // Field a:Landroid/view/View;
     122: ldc           #149                // int 2131296352
     124: invokevirtual #133                // Method android/view/View.findViewById:(I)Landroid/view/View;
     127: new           #12                 // class ryey/easer/core/ui/b$4
     130: dup
     131: aload_0
     132: invokespecial #169                // Method ryey/easer/core/ui/b$4."<init>":(Lryey/easer/core/ui/b;)V
     135: invokevirtual #163                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     138: aload_0
     139: getfield      #126                // Field a:Landroid/view/View;
     142: ldc           #170                // int 2131296412
     144: invokevirtual #133                // Method android/view/View.findViewById:(I)Landroid/view/View;
     147: checkcast     #172                // class android/support/design/widget/FloatingActionButton
     150: new           #14                 // class ryey/easer/core/ui/b$5
     153: dup
     154: aload_0
     155: invokespecial #173                // Method ryey/easer/core/ui/b$5."<init>":(Lryey/easer/core/ui/b;)V
     158: invokevirtual #174                // Method android/support/design/widget/FloatingActionButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     161: new           #176                // class android/content/IntentFilter
     164: dup
     165: ldc           #178                // String ryey.easer.action.STATE_CHANGED
     167: invokespecial #181                // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
     170: astore_1
     171: aload_0
     172: invokevirtual #111                // Method getActivity:()Landroid/support/v4/app/j;
     175: aload_0
     176: getfield      #31                 // Field d:Landroid/content/BroadcastReceiver;
     179: aload_1
     180: invokevirtual #185                // Method android/support/v4/app/j.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
     183: pop
     184: aload_0
     185: getfield      #126                // Field a:Landroid/view/View;
     188: areturn

  public void onDestroyView();
    Code:
       0: aload_0
       1: invokespecial #188                // Method android/support/v4/app/i.onDestroyView:()V
       4: aload_0
       5: invokevirtual #111                // Method getActivity:()Landroid/support/v4/app/j;
       8: aload_0
       9: getfield      #31                 // Field d:Landroid/content/BroadcastReceiver;
      12: invokevirtual #192                // Method android/support/v4/app/j.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      15: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #199,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: istore_2
       7: iload_2
       8: ldc           #200                // int 2131296285
      10: if_icmpne     22
      13: aload_0
      14: invokevirtual #111                // Method getActivity:()Landroid/support/v4/app/j;
      17: invokestatic  #203                // Method ryey/easer/core/EHService.a:(Landroid/content/Context;)V
      20: iconst_1
      21: ireturn
      22: iload_2
      23: ldc           #204                // int 2131296286
      25: if_icmpne     37
      28: aload_0
      29: invokevirtual #111                // Method getActivity:()Landroid/support/v4/app/j;
      32: invokestatic  #206                // Method ryey/easer/core/EHService.b:(Landroid/content/Context;)V
      35: iconst_1
      36: ireturn
      37: aload_0
      38: aload_1
      39: invokespecial #208                // Method android/support/v4/app/i.onOptionsItemSelected:(Landroid/view/MenuItem;)Z
      42: ireturn

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #211                // Method android/support/v4/app/i.onResume:()V
       4: aload_0
       5: invokespecial #81                 // Method a:()V
       8: return
}
