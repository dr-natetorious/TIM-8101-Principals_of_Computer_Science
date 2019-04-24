public class ryey.easer.core.ui.a extends android.support.v4.app.i {
  final android.content.BroadcastReceiver a;

  ryey.easer.core.ui.a$b b;

  ryey.easer.core.ui.a$a c;

  boolean d;

  ryey.easer.core.log.ActivityLogService$a e;

  android.content.ServiceConnection f;

  public ryey.easer.core.ui.a();
    Code:
       0: aload_0
       1: invokespecial #32                 // Method android/support/v4/app/i."<init>":()V
       4: aload_0
       5: new           #6                  // class ryey/easer/core/ui/a$1
       8: dup
       9: aload_0
      10: invokespecial #35                 // Method ryey/easer/core/ui/a$1."<init>":(Lryey/easer/core/ui/a;)V
      13: putfield      #37                 // Field a:Landroid/content/BroadcastReceiver;
      16: aload_0
      17: iconst_0
      18: putfield      #39                 // Field g:I
      21: aload_0
      22: iconst_0
      23: putfield      #41                 // Field d:Z
      26: aload_0
      27: new           #8                  // class ryey/easer/core/ui/a$2
      30: dup
      31: aload_0
      32: invokespecial #42                 // Method ryey/easer/core/ui/a$2."<init>":(Lryey/easer/core/ui/a;)V
      35: putfield      #44                 // Field f:Landroid/content/ServiceConnection;
      38: return

  static ryey.easer.core.ui.a a();
    Code:
       0: new           #48                 // class android/os/Bundle
       3: dup
       4: invokespecial #49                 // Method android/os/Bundle."<init>":()V
       7: astore_0
       8: aload_0
       9: ldc           #51                 // String ryey.easer.core.ui.ActivityHistoryFragment.ARG.SIZE
      11: iconst_1
      12: invokevirtual #55                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      15: new           #2                  // class ryey/easer/core/ui/a
      18: dup
      19: invokespecial #56                 // Method "<init>":()V
      22: astore_1
      23: aload_1
      24: aload_0
      25: invokevirtual #60                 // Method setArguments:(Landroid/os/Bundle;)V
      28: aload_1
      29: areturn

  static void a(ryey.easer.core.ui.a);
    Code:
       0: aload_0
       1: invokespecial #62                 // Method d:()V
       4: return

  static ryey.easer.core.ui.a b();
    Code:
       0: new           #48                 // class android/os/Bundle
       3: dup
       4: invokespecial #49                 // Method android/os/Bundle."<init>":()V
       7: astore_0
       8: aload_0
       9: ldc           #51                 // String ryey.easer.core.ui.ActivityHistoryFragment.ARG.SIZE
      11: iconst_0
      12: invokevirtual #55                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      15: new           #2                  // class ryey/easer/core/ui/a
      18: dup
      19: invokespecial #56                 // Method "<init>":()V
      22: astore_1
      23: aload_1
      24: aload_0
      25: invokevirtual #60                 // Method setArguments:(Landroid/os/Bundle;)V
      28: aload_1
      29: areturn

  static void b(ryey.easer.core.ui.a);
    Code:
       0: aload_0
       1: invokespecial #64                 // Method c:()V
       4: return

  public void onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_2
       1: ldc           #92                 // int 2131492864
       3: aload_1
       4: invokevirtual #98                 // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
       7: aload_0
       8: aload_1
       9: aload_2
      10: invokespecial #100                // Method android/support/v4/app/i.onCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)V
      13: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_0
       1: invokevirtual #106                // Method getArguments:()Landroid/os/Bundle;
       4: astore_3
       5: aload_3
       6: ifnull        24
       9: iconst_1
      10: aload_3
      11: ldc           #51                 // String ryey.easer.core.ui.ActivityHistoryFragment.ARG.SIZE
      13: invokevirtual #110                // Method android/os/Bundle.getInt:(Ljava/lang/String;)I
      16: if_icmpne     24
      19: aload_0
      20: iconst_1
      21: putfield      #39                 // Field g:I
      24: aload_0
      25: getfield      #39                 // Field g:I
      28: ifne          126
      31: aload_0
      32: invokevirtual #114                // Method getActivity:()Landroid/support/v4/app/j;
      35: ldc           #115                // int 2131624294
      37: invokevirtual #121                // Method android/support/v4/app/j.setTitle:(I)V
      40: aload_1
      41: ldc           #122                // int 2131427389
      43: aload_2
      44: iconst_0
      45: invokevirtual #127                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      48: astore_1
      49: aload_1
      50: ldc           #128                // int 2131296577
      52: invokevirtual #134                // Method android/view/View.findViewById:(I)Landroid/view/View;
      55: checkcast     #136                // class android/support/v7/widget/RecyclerView
      58: astore_2
      59: aload_2
      60: iconst_1
      61: invokevirtual #140                // Method android/support/v7/widget/RecyclerView.setHasFixedSize:(Z)V
      64: new           #142                // class android/support/v7/widget/LinearLayoutManager
      67: dup
      68: aload_0
      69: invokevirtual #146                // Method getContext:()Landroid/content/Context;
      72: invokespecial #149                // Method android/support/v7/widget/LinearLayoutManager."<init>":(Landroid/content/Context;)V
      75: astore_3
      76: aload_2
      77: aload_3
      78: invokevirtual #153                // Method android/support/v7/widget/RecyclerView.setLayoutManager:(Landroid/support/v7/widget/RecyclerView$i;)V
      81: aload_2
      82: new           #155                // class android/support/v7/widget/an
      85: dup
      86: aload_2
      87: invokevirtual #156                // Method android/support/v7/widget/RecyclerView.getContext:()Landroid/content/Context;
      90: aload_3
      91: invokevirtual #159                // Method android/support/v7/widget/LinearLayoutManager.g:()I
      94: invokespecial #162                // Method android/support/v7/widget/an."<init>":(Landroid/content/Context;I)V
      97: invokevirtual #165                // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView$h;)V
     100: aload_0
     101: new           #10                 // class ryey/easer/core/ui/a$a
     104: dup
     105: invokespecial #166                // Method ryey/easer/core/ui/a$a."<init>":()V
     108: putfield      #72                 // Field c:Lryey/easer/core/ui/a$a;
     111: aload_2
     112: aload_0
     113: getfield      #72                 // Field c:Lryey/easer/core/ui/a$a;
     116: invokevirtual #170                // Method android/support/v7/widget/RecyclerView.setAdapter:(Landroid/support/v7/widget/RecyclerView$a;)V
     119: aload_0
     120: iconst_1
     121: invokevirtual #173                // Method setHasOptionsMenu:(Z)V
     124: aload_1
     125: areturn
     126: aload_1
     127: ldc           #174                // int 2131427402
     129: aload_2
     130: iconst_0
     131: invokevirtual #127                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
     134: astore_1
     135: aload_0
     136: new           #15                 // class ryey/easer/core/ui/a$b
     139: dup
     140: aload_1
     141: new           #176                // class java/lang/ref/WeakReference
     144: dup
     145: aload_0
     146: invokevirtual #146                // Method getContext:()Landroid/content/Context;
     149: invokespecial #179                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
     152: invokespecial #182                // Method ryey/easer/core/ui/a$b."<init>":(Landroid/view/View;Ljava/lang/ref/WeakReference;)V
     155: putfield      #76                 // Field b:Lryey/easer/core/ui/a$b;
     158: aload_1
     159: areturn

  public void onDestroyView();
    Code:
       0: aload_0
       1: invokespecial #185                // Method android/support/v4/app/i.onDestroyView:()V
       4: aload_0
       5: invokevirtual #114                // Method getActivity:()Landroid/support/v4/app/j;
       8: aload_0
       9: getfield      #37                 // Field a:Landroid/content/BroadcastReceiver;
      12: invokevirtual #189                // Method android/support/v4/app/j.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      15: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #196,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: ldc           #197                // int 2131296270
       8: if_icmpne     31
      11: aload_0
      12: getfield      #66                 // Field e:Lryey/easer/core/log/ActivityLogService$a;
      15: ifnonnull     25
      18: aload_0
      19: iconst_1
      20: putfield      #41                 // Field d:Z
      23: iconst_1
      24: ireturn
      25: aload_0
      26: invokespecial #64                 // Method c:()V
      29: iconst_1
      30: ireturn
      31: aload_0
      32: aload_1
      33: invokespecial #199                // Method android/support/v4/app/i.onOptionsItemSelected:(Landroid/view/MenuItem;)Z
      36: ireturn

  public void onPause();
    Code:
       0: aload_0
       1: invokespecial #202                // Method android/support/v4/app/i.onPause:()V
       4: aload_0
       5: invokevirtual #146                // Method getContext:()Landroid/content/Context;
       8: aload_0
       9: getfield      #44                 // Field f:Landroid/content/ServiceConnection;
      12: invokevirtual #208                // Method android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
      15: return

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #211                // Method android/support/v4/app/i.onResume:()V
       4: aload_0
       5: invokespecial #62                 // Method d:()V
       8: aload_0
       9: invokevirtual #146                // Method getContext:()Landroid/content/Context;
      12: new           #213                // class android/content/Intent
      15: dup
      16: aload_0
      17: invokevirtual #146                // Method getContext:()Landroid/content/Context;
      20: ldc           #78                 // class ryey/easer/core/log/ActivityLogService
      22: invokespecial #216                // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      25: aload_0
      26: getfield      #44                 // Field f:Landroid/content/ServiceConnection;
      29: iconst_1
      30: invokevirtual #220                // Method android/content/Context.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      33: pop
      34: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: new           #224                // class android/content/IntentFilter
       3: dup
       4: invokespecial #225                // Method android/content/IntentFilter."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #227                // String ryey.easer.action.PROFILE_UPDATED
      11: invokevirtual #231                // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      14: aload_0
      15: invokevirtual #146                // Method getContext:()Landroid/content/Context;
      18: aload_0
      19: getfield      #37                 // Field a:Landroid/content/BroadcastReceiver;
      22: aload_1
      23: invokevirtual #235                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      26: pop
      27: return
}
