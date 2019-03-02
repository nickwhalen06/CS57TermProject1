#  Assignment 1.3
### Nick Whalen

### Project Setup
1. File Structure:
![Alt text](readme_images/14_file_structure.png?raw=true "Project File Structure")

2. Running 'mvn clean package docker:build':
![Alt text](readme_images/13_maven_docker_build.png?raw=true "Docker Build")

3. Running 'docker-compose -f docker/common/docker-compose.yml up' after mvn clean and mvn package of root maven project:
![Alt text](readme_images/11_docker_compose_cmd.png?raw=true "Docker Compose Command Output")

4. Docker containers running with each service:
![Alt text](readme_images/12_docker_env.png?raw=true "Docker Environment")

5. GitHub repo setup to host config profiles:
https://github.com/nickwhalen06/config-repo/ 
### Getting profiles from the config server
1. Get the default profile:
![Alt text](readme_images/1_default_profile.png?raw=true "Default Profile")

2.  Get the dev profile:
![Alt text](readme_images/2_dev_profile.png?raw=true "Dev Profile")

3.  Get the prod profile:
![Alt text](readme_images/3_prod_profile.png?raw=true "Prod Profile")

### Calling the Asset service 
4. GET all assets:
![Alt text](readme_images/4_get_assets.png?raw=true "GET Assets")

5. GET assets by ID:
![Alt text](readme_images/5_get_assets_by_id.png?raw=true "GET Assets By ID")

6. PUT asset:
![Alt text](readme_images/6_put_asset.png?raw=true "PUT Asset")

7. GET after PUT:
![Alt text](readme_images/15_get_after_put.png?raw=true "GET after PUT")

8. POST asset:
![Alt text](readme_images/7_post_asset.png?raw=true "POST Asset")

9. GET after POST asset:
![Alt text](readme_images/8_get_after_post.png?raw=true "GET after POST")

10. DELETE 
![Alt text](readme_images/9_delete.png?raw=true "DELETE")

11. GET after DELETE
![Alt text](readme_images/10_get_after_delete.png?raw=true "GET after DELETE")
