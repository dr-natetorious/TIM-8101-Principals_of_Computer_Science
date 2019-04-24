public class ryey.easer.core.ui.data.profile.EditProfileActivity extends ryey.easer.core.ui.data.b<ryey.easer.core.a.g, ryey.easer.core.a.a.d> implements ryey.easer.core.ui.data.profile.b$c {
  ryey.easer.core.f e;

  android.widget.EditText f;

  ryey.easer.core.ui.data.profile.b g;

  java.util.List<ryey.easer.core.ui.data.profile.a<?>> h;

  java.util.List<ryey.easer.core.ui.data.profile.d> i;

  static {};
    Code:
       0: ldc           #24                 // String profile
       2: putstatic     #28                 // Field a:Ljava/lang/String;
       5: return

  public ryey.easer.core.ui.data.profile.EditProfileActivity();
    Code:
       0: aload_0
       1: invokespecial #32                 // Method ryey/easer/core/ui/data/b."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #34                 // Field f:Landroid/widget/EditText;
       9: aload_0
      10: new           #36                 // class java/util/ArrayList
      13: dup
      14: invokespecial #37                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #39                 // Field h:Ljava/util/List;
      20: aload_0
      21: new           #36                 // class java/util/ArrayList
      24: dup
      25: invokespecial #37                 // Method java/util/ArrayList."<init>":()V
      28: putfield      #41                 // Field i:Ljava/util/List;
      31: return

  protected ryey.easer.core.a.a.a a();
    Code:
       0: aload_0
       1: invokevirtual #45                 // Method g:()Lryey/easer/core/a/a/d;
       4: areturn

  void a(java.lang.String, ryey.easer.c.a);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_1
       3: aload_2
       4: invokestatic  #51                 // Method ryey/easer/core/ui/data/profile/d.a:(Ljava/lang/String;Lryey/easer/c/a;)Lryey/easer/core/ui/data/profile/d;
       7: astore_1
       8: aload_0
       9: invokevirtual #55                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
      12: invokevirtual #60                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      15: astore_2
      16: aload_2
      17: ldc           #61                 // int 2131296460
      19: aload_1
      20: invokevirtual #66                 // Method android/support/v4/app/u.a:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
      23: pop
      24: aload_0
      25: getfield      #41                 // Field i:Ljava/util/List;
      28: aload_1
      29: invokeinterface #72,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      34: pop
      35: aload_2
      36: invokevirtual #76                 // Method android/support/v4/app/u.c:()I
      39: pop
      40: aload_0
      41: monitorexit
      42: return
      43: astore_1
      44: aload_0
      45: monitorexit
      46: aload_1
      47: athrow
    Exception table:
       from    to  target type
           2    40    43   any

  <T extends ryey.easer.commons.local_plugin.c.b> void a(ryey.easer.commons.local_plugin.c.d<T>, T);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: invokevirtual #55                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
       6: invokevirtual #60                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
       9: astore_3
      10: aload_1
      11: invokestatic  #82                 // Method ryey/easer/core/ui/data/profile/a.a:(Lryey/easer/commons/local_plugin/c/d;)Lryey/easer/core/ui/data/profile/a;
      14: astore        4
      16: aload_3
      17: ldc           #61                 // int 2131296460
      19: aload         4
      21: aload_1
      22: invokeinterface #87,  1           // InterfaceMethod ryey/easer/commons/local_plugin/c/d.a:()Ljava/lang/String;
      27: invokevirtual #90                 // Method android/support/v4/app/u.a:(ILandroid/support/v4/app/i;Ljava/lang/String;)Landroid/support/v4/app/u;
      30: pop
      31: aload_0
      32: getfield      #39                 // Field h:Ljava/util/List;
      35: aload         4
      37: invokeinterface #72,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      42: pop
      43: aload_0
      44: getfield      #92                 // Field g:Lryey/easer/core/ui/data/profile/b;
      47: aload_1
      48: invokevirtual #97                 // Method ryey/easer/core/ui/data/profile/b.a:(Lryey/easer/commons/local_plugin/c/d;)V
      51: aload_3
      52: invokevirtual #76                 // Method android/support/v4/app/u.c:()I
      55: pop
      56: aload         4
      58: aload_2
      59: invokevirtual #101                // Method ryey/easer/core/ui/data/profile/a.b:(Ljava/lang/Object;)V
      62: aload_0
      63: monitorexit
      64: return
      65: astore_1
      66: aload_0
      67: monitorexit
      68: aload_1
      69: athrow
    Exception table:
       from    to  target type
           2    62    65   any

  protected void a(ryey.easer.core.a.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #106                // class ryey/easer/core/a/g
       5: invokevirtual #109                // Method a:(Lryey/easer/core/a/g;)V
       8: return

  protected void a(ryey.easer.core.a.g);
    Code:
       0: aload_0
       1: getfield      #34                 // Field f:Landroid/widget/EditText;
       4: aload_0
       5: getfield      #112                // Field d:Ljava/lang/String;
       8: invokevirtual #118                // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      11: aload_0
      12: invokevirtual #120                // Method i:()V
      15: invokestatic  #125                // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      18: invokevirtual #128                // Method ryey/easer/plugins/b.c:()Lryey/easer/plugins/b$c;
      21: astore_2
      22: aload_1
      23: invokevirtual #131                // Method ryey/easer/core/a/g.c:()Ljava/util/Set;
      26: invokeinterface #137,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      31: astore_3
      32: aload_3
      33: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      38: ifeq          172
      41: aload_3
      42: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      47: checkcast     #149                // class java/lang/String
      50: astore        4
      52: aload_1
      53: aload         4
      55: invokevirtual #152                // Method ryey/easer/core/a/g.b:(Ljava/lang/String;)Ljava/util/Collection;
      58: astore        5
      60: aload_2
      61: aload         4
      63: invokevirtual #157                // Method ryey/easer/plugins/b$c.a:(Ljava/lang/String;)Z
      66: ifeq          131
      69: aload_0
      70: iconst_0
      71: aload         4
      73: invokestatic  #162                // Method ryey/easer/commons/a.a:(Landroid/content/Context;ILjava/lang/String;)Z
      76: ifeq          32
      79: aload_2
      80: aload         4
      82: invokevirtual #165                // Method ryey/easer/plugins/b$c.b:(Ljava/lang/String;)Lryey/easer/commons/local_plugin/d;
      85: checkcast     #84                 // class ryey/easer/commons/local_plugin/c/d
      88: astore        4
      90: aload         5
      92: invokeinterface #168,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      97: astore        5
      99: aload         5
     101: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     106: ifeq          32
     109: aload_0
     110: aload         4
     112: aload         5
     114: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     119: checkcast     #170                // class ryey/easer/core/a/h
     122: getfield      #173                // Field ryey/easer/core/a/h.a:Lryey/easer/commons/local_plugin/c/b;
     125: invokevirtual #175                // Method a:(Lryey/easer/commons/local_plugin/c/d;Lryey/easer/commons/local_plugin/c/b;)V
     128: goto          99
     131: aload         5
     133: invokeinterface #168,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
     138: astore        5
     140: aload         5
     142: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     147: ifeq          32
     150: aload_0
     151: aload         4
     153: aload         5
     155: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     160: checkcast     #170                // class ryey/easer/core/a/h
     163: getfield      #178                // Field ryey/easer/core/a/h.b:Lryey/easer/c/a;
     166: invokevirtual #180                // Method a:(Ljava/lang/String;Lryey/easer/c/a;)V
     169: goto          140
     172: return

  public void a(ryey.easer.core.ui.data.profile.b$a);
    Code:
       0: aload_1
       1: invokevirtual #185                // Method ryey/easer/core/ui/data/profile/b$a.a:()Z
       4: ifne          17
       7: aload_0
       8: aload_1
       9: getfield      #188                // Field ryey/easer/core/ui/data/profile/b$a.d:Lryey/easer/commons/local_plugin/c/d;
      12: aconst_null
      13: invokevirtual #175                // Method a:(Lryey/easer/commons/local_plugin/c/d;Lryey/easer/commons/local_plugin/c/b;)V
      16: return
      17: aload_0
      18: aload_1
      19: getfield      #189                // Field ryey/easer/core/ui/data/profile/b$a.a:Ljava/lang/String;
      22: aconst_null
      23: invokevirtual #180                // Method a:(Ljava/lang/String;Lryey/easer/c/a;)V
      26: return

  protected java.lang.String b();
    Code:
       0: aload_0
       1: ldc           #190                // int 2131624310
       3: invokevirtual #194                // Method getString:(I)Ljava/lang/String;
       6: areturn

  protected int c();
    Code:
       0: ldc           #195                // int 2131427360
       2: ireturn

  protected void d();
    Code:
       0: aload_0
       1: aload_0
       2: ldc           #196                // int 2131296390
       4: invokevirtual #200                // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #114                // class android/widget/EditText
      10: putfield      #34                 // Field f:Landroid/widget/EditText;
      13: aload_0
      14: new           #94                 // class ryey/easer/core/ui/data/profile/b
      17: dup
      18: invokespecial #201                // Method ryey/easer/core/ui/data/profile/b."<init>":()V
      21: putfield      #92                 // Field g:Lryey/easer/core/ui/data/profile/b;
      24: aload_0
      25: getfield      #92                 // Field g:Lryey/easer/core/ui/data/profile/b;
      28: aload_0
      29: invokevirtual #204                // Method ryey/easer/core/ui/data/profile/b.a:(Lryey/easer/core/ui/data/profile/b$c;)V
      32: aload_0
      33: ldc           #205                // int 2131296313
      35: invokevirtual #200                // Method findViewById:(I)Landroid/view/View;
      38: new           #9                  // class ryey/easer/core/ui/data/profile/EditProfileActivity$1
      41: dup
      42: aload_0
      43: invokespecial #208                // Method ryey/easer/core/ui/data/profile/EditProfileActivity$1."<init>":(Lryey/easer/core/ui/data/profile/EditProfileActivity;)V
      46: invokevirtual #214                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      49: aload_0
      50: invokevirtual #55                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
      53: astore_2
      54: aload_2
      55: invokevirtual #60                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      58: astore_1
      59: aload_2
      60: invokevirtual #217                // Method android/support/v4/app/n.d:()Ljava/util/List;
      63: invokeinterface #218,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      68: astore_2
      69: aload_2
      70: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      75: ifeq          95
      78: aload_1
      79: aload_2
      80: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      85: checkcast     #220                // class android/support/v4/app/i
      88: invokevirtual #223                // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      91: pop
      92: goto          69
      95: aload_1
      96: invokevirtual #76                 // Method android/support/v4/app/u.c:()I
      99: pop
     100: return

  protected ryey.easer.core.a.f e();
    Code:
       0: aload_0
       1: invokevirtual #227                // Method h:()Lryey/easer/core/a/g;
       4: areturn

  protected ryey.easer.core.a.a.d g();
    Code:
       0: new           #229                // class ryey/easer/core/a/a/d
       3: dup
       4: aload_0
       5: invokespecial #232                // Method ryey/easer/core/a/a/d."<init>":(Landroid/content/Context;)V
       8: areturn

  protected ryey.easer.core.a.g h();
    Code:
       0: new           #106                // class ryey/easer/core/a/g
       3: dup
       4: iconst_m1
       5: invokespecial #237                // Method ryey/easer/core/a/g."<init>":(I)V
       8: astore_1
       9: aload_1
      10: aload_0
      11: getfield      #34                 // Field f:Landroid/widget/EditText;
      14: invokevirtual #241                // Method android/widget/EditText.getText:()Landroid/text/Editable;
      17: invokevirtual #246                // Method java/lang/Object.toString:()Ljava/lang/String;
      20: invokevirtual #249                // Method ryey/easer/core/a/g.a:(Ljava/lang/String;)V
      23: aload_0
      24: getfield      #39                 // Field h:Ljava/util/List;
      27: invokeinterface #218,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      32: astore_3
      33: aload_3
      34: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      39: ifeq          126
      42: aload_3
      43: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      48: checkcast     #79                 // class ryey/easer/core/ui/data/profile/a
      51: astore_2
      52: aload_2
      53: invokevirtual #251                // Method ryey/easer/core/ui/data/profile/a.c:()Z
      56: ifne          62
      59: goto          33
      62: aload_2
      63: invokevirtual #254                // Method ryey/easer/core/ui/data/profile/a.b:()Lryey/easer/commons/local_plugin/c/b;
      66: astore        4
      68: aload         4
      70: invokeinterface #257,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/b.a:()Z
      75: ifne          86
      78: new           #234                // class ryey/easer/commons/local_plugin/c
      81: dup
      82: invokespecial #258                // Method ryey/easer/commons/local_plugin/c."<init>":()V
      85: athrow
      86: aload_2
      87: iconst_0
      88: invokevirtual #261                // Method ryey/easer/core/ui/data/profile/a.a:(Z)V
      91: aload_1
      92: invokestatic  #125                // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      95: invokevirtual #128                // Method ryey/easer/plugins/b.c:()Lryey/easer/plugins/b$c;
      98: aload         4
     100: invokevirtual #264                // Method ryey/easer/plugins/b$c.a:(Lryey/easer/commons/local_plugin/f;)Lryey/easer/commons/local_plugin/d;
     103: checkcast     #84                 // class ryey/easer/commons/local_plugin/c/d
     106: invokeinterface #87,  1           // InterfaceMethod ryey/easer/commons/local_plugin/c/d.a:()Ljava/lang/String;
     111: aload         4
     113: invokevirtual #267                // Method ryey/easer/core/a/g.a:(Ljava/lang/String;Lryey/easer/commons/local_plugin/c/b;)V
     116: goto          33
     119: aload_2
     120: iconst_1
     121: invokevirtual #261                // Method ryey/easer/core/ui/data/profile/a.a:(Z)V
     124: aconst_null
     125: areturn
     126: aload_0
     127: getfield      #41                 // Field i:Ljava/util/List;
     130: invokeinterface #218,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     135: astore_3
     136: aload_3
     137: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     142: ifeq          196
     145: aload_3
     146: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     151: checkcast     #48                 // class ryey/easer/core/ui/data/profile/d
     154: astore_2
     155: aload_2
     156: invokevirtual #268                // Method ryey/easer/core/ui/data/profile/d.c:()Z
     159: ifne          165
     162: goto          136
     165: aload_2
     166: invokevirtual #271                // Method ryey/easer/core/ui/data/profile/d.a:()Lryey/easer/c/a;
     169: astore        4
     171: aload_2
     172: iconst_0
     173: invokevirtual #272                // Method ryey/easer/core/ui/data/profile/d.a:(Z)V
     176: aload_1
     177: aload_2
     178: invokevirtual #274                // Method ryey/easer/core/ui/data/profile/d.b:()Ljava/lang/String;
     181: aload         4
     183: invokevirtual #275                // Method ryey/easer/core/a/g.a:(Ljava/lang/String;Lryey/easer/c/a;)V
     186: goto          136
     189: aload_2
     190: iconst_1
     191: invokevirtual #272                // Method ryey/easer/core/ui/data/profile/d.a:(Z)V
     194: aconst_null
     195: areturn
     196: aload_1
     197: areturn
     198: astore_1
     199: goto          119
     202: astore_1
     203: goto          189
    Exception table:
       from    to  target type
          62    86   198   Class ryey/easer/commons/local_plugin/c
          86   116   198   Class ryey/easer/commons/local_plugin/c
         165   186   202   Class ryey/easer/commons/local_plugin/c

  void i();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: invokevirtual #55                 // Method getSupportFragmentManager:()Landroid/support/v4/app/n;
       6: invokevirtual #60                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
       9: astore_1
      10: aload_0
      11: getfield      #39                 // Field h:Ljava/util/List;
      14: invokeinterface #218,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      19: astore_2
      20: aload_2
      21: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      26: ifeq          46
      29: aload_1
      30: aload_2
      31: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      36: checkcast     #220                // class android/support/v4/app/i
      39: invokevirtual #223                // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      42: pop
      43: goto          20
      46: aload_0
      47: getfield      #39                 // Field h:Ljava/util/List;
      50: invokeinterface #278,  1          // InterfaceMethod java/util/List.clear:()V
      55: aload_0
      56: getfield      #41                 // Field i:Ljava/util/List;
      59: invokeinterface #218,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      64: astore_2
      65: aload_2
      66: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      71: ifeq          91
      74: aload_1
      75: aload_2
      76: invokeinterface #147,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      81: checkcast     #220                // class android/support/v4/app/i
      84: invokevirtual #223                // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      87: pop
      88: goto          65
      91: aload_0
      92: getfield      #41                 // Field i:Ljava/util/List;
      95: invokeinterface #278,  1          // InterfaceMethod java/util/List.clear:()V
     100: aload_1
     101: invokevirtual #76                 // Method android/support/v4/app/u.c:()I
     104: pop
     105: aload_0
     106: monitorexit
     107: return
     108: astore_1
     109: aload_0
     110: monitorexit
     111: aload_1
     112: athrow
    Exception table:
       from    to  target type
           2    20   108   any
          20    43   108   any
          46    65   108   any
          65    88   108   any
          91   105   108   any

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #282                // Method ryey/easer/core/ui/data/b.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: new           #284                // class ryey/easer/core/f
       9: dup
      10: aload_0
      11: invokespecial #285                // Method ryey/easer/core/f."<init>":(Landroid/content/Context;)V
      14: putfield      #287                // Field e:Lryey/easer/core/f;
      17: aload_0
      18: getfield      #287                // Field e:Lryey/easer/core/f;
      21: invokevirtual #289                // Method ryey/easer/core/f.a:()V
      24: return

  protected void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #292                // Method ryey/easer/core/ui/data/b.onDestroy:()V
       4: aload_0
       5: getfield      #287                // Field e:Lryey/easer/core/f;
       8: invokevirtual #294                // Method ryey/easer/core/f.b:()V
      11: return
}
