//childern-->root
static void post(node root){
  if(root==null){
    return;
  }
  for(node i:root.children){
    dfs(i);
  }
  System.out.print(root.data+" ");
}


//root-->childern
static void pre(node root){
  if(root==null){
    return;
  }
  System.out.print(root.data+" ");
  for(node i:root.children){
    dfs(i);
  }
}
