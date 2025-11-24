#!/usr/bin/env python3
import os
import shutil
import re

def organize_solution(file_path, problem_name):
    """Move solution to organized folder structure"""
    
    # Read the original file
    with open(file_path, 'r') as f:
        content = f.read()
    
    # Extract package name (category)
    package_match = re.search(r'package\s+(\w+);', content)
    category = package_match.group(1) if package_match else 'General'
    
    # Create directory structure
    target_dir = os.path.join(os.path.dirname(file_path), category, problem_name)
    os.makedirs(target_dir, exist_ok=True)
    
    # Update package declaration
    updated_content = re.sub(
        r'package\s+\w+;', 
        f'package {category}.{problem_name};', 
        content
    )
    
    # Write to new location
    target_file = os.path.join(target_dir, 'Solution.java')
    with open(target_file, 'w') as f:
        f.write(updated_content)
    
    print(f"Organized: {file_path} -> {target_file}")

# Example usage
if __name__ == "__main__":
    # organize_solution("LinkedList/Middle.java", "MiddleOfLinkedList")
    pass