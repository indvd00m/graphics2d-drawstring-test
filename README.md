# Graphics2D.drawString Test

Test for check pixel-by-pixel identical text rendering with `Graphics2D.drawString` on all java platforms with same font.

See http://stackoverflow.com/questions/40745529/graphics2d-identical-text-rendering-on-all-platforms

## Running tests
```
git clone https://github.com/indvd00m/graphics2d-drawstring-test/
cd graphics2d-drawstring-test
mvn clean test
```
If tests passed you can see identical tests results, for example:
```
Expected: 
                                                            
                          █                                 
 ███                      █      █████                      
 █  █                     █        █               █        
 █  █ ████   ██  █  █   ███  ██    █    ██  █  █  ████      
 ███  █     █  █ █  █  █  █ █  █   █   █  █  ██    █        
 █     ███  ████ █  █  █  █ █  █   █   ████  ██    █        
 █       █  █    █  █  █  █ █  █   █   █     ██    █        
 █    ████   ███ ████   ███  ██    █    ███ █  █   ███      
                                                            
Actual:
                                                            
                          █                                 
 ███                      █      █████                      
 █  █                     █        █               █        
 █  █ ████   ██  █  █   ███  ██    █    ██  █  █  ████      
 ███  █     █  █ █  █  █  █ █  █   █   █  █  ██    █        
 █     ███  ████ █  █  █  █ █  █   █   ████  ██    █        
 █       █  █    █  █  █  █ █  █   █   █     ██    █        
 █    ████   ███ ████   ███  ██    █    ███ █  █   ███      
                                                            

```

## CI
Maven artifacts are built via Travis: 
[![Build Status](https://travis-ci.org/indvd00m/graphics2d-drawstring-test.svg?branch=master)](https://travis-ci.org/indvd00m/graphics2d-drawstring-test)

## Release notes

### Version 0.1.0-SNAPSHOT
- First beta version.

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases. That said, the following features are planned for upcoming releases:
- ...

## Issue tracking

The issues for this project are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Graphics2D.drawString Test is distributed under Apache License 2.0. For license terms, see LICENSE.

Graphics2D.drawString Test is written by David E. Veliev.
