class Solution {
public:
    int minDepth(TreeNode* root) {
        if(!root)
            return 0;
        else if(root->left==0){
            return 1+minDepth(root->right);
        }else if(root->right==0){
            return 1+minDepth(root->left);
        }
        int rightH = minDepth(root->right);
        int leftH = minDepth(root->left);
        
        return 1+min(rightH,leftH);
    }
};